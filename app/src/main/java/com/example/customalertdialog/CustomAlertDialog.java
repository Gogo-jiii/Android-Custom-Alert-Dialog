package com.example.customalertdialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class CustomAlertDialog extends DialogFragment {

    private AlertDialog.Builder builder;
    private Context context;
    private Activity activity;
    private int layout;

    public CustomAlertDialog(Context context, int layout) {
        this.context = context;
        this.activity = (Activity) context;
        this.layout = layout;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = activity.getLayoutInflater();
        View dialogView = inflater.inflate(layout, null);
        builder.setView(dialogView);

        Button button = dialogView.findViewById(R.id.button);
        button.setOnClickListener(v -> {
            getDialog().dismiss();
            Toast.makeText(context, "Dismissed.", Toast.LENGTH_SHORT).show();
        });
        return builder.create();
    }
}
