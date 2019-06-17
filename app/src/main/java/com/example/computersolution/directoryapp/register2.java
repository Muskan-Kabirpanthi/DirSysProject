package com.example.computersolution.directoryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class register2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register2);

        try {

            String s = getIntent().getExtras().getString(UtilsClass.NAME_LOGIN);
            String ss = getIntent().getStringExtra(UtilsClass.NAME_LOGIN);
            Toast.makeText(register2.this, ss, Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(register2.this, "Error Occur!!", Toast.LENGTH_LONG).show();
        }

    }

}
