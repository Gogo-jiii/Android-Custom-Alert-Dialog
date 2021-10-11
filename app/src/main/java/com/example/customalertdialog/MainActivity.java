package com.example.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCustomAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCustomAlertDialog = findViewById(R.id.btnCustomAlertDialog);
        btnCustomAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomAlertDialog alertDialog = new CustomAlertDialog(MainActivity.this, R.layout.custom_layout);
                alertDialog.show(getSupportFragmentManager(), "custom dialog");
                alertDialog.setCancelable(false);
            }
        });
    }
}