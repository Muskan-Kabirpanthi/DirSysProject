package com.example.computersolution.directoryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private  TextView mNotLoginTv;
    private EditText mUsernameEt;
    private  EditText mPasswordEt;
    private Button mLoginBtn;
    private  Button mnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNotLoginTv=(TextView) findViewById(R.id.not_register);
        mLoginBtn=(Button) findViewById(R.id.loginBtn);
        mUsernameEt=(EditText) findViewById(R.id.Username);
        mPasswordEt=(EditText) findViewById(R.id.Password);
        mNotLoginTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){startRegisterScreen();
        }
        });
        mnext=(Button) findViewById(R.id.next);
        mnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){startRegister2Screen();
            }
        });


    }

    private void startRegister2Screen() {
        Intent  intent2 = new Intent( this,register2.class);
        intent2.putExtra(UtilsClass.NAME_LOGIN, "Sgsits Coming..");
        startActivity(intent2);

    }

    private void startRegisterScreen() {
    Intent  intent = new Intent( this,register1.class);
    intent.putExtra(UtilsClass.NAME_LOGIN, "Sgsits Coming..");
    startActivity(intent);


    }
    private  String TAG="SGSITS";

    @Override
    public void onClick(View view)
    {
        switch(view.getId()){
            case R.id.loginBtn:
                Log.i(TAG ,"LOGIN BUTTON CLICKED...");
            validateLoginScreen();
            break;
        }

    }
    private  void validateLoginScreen() {
        if (mUsernameEt.getText().toString().isEmpty()) {
            Log.i(TAG, "Login Failed Please provide Username...");
            Toast.makeText(this, "Please provide User nsme", Toast.LENGTH_LONG).show();
        } else if (mPasswordEt.getText().toString().isEmpty()) {
            Log.i(TAG, "Login failed Please provide password...");
            Toast.makeText(this, "Please provide password", Toast.LENGTH_LONG).show();
        } else {

         startHomeActivity();
        }

    }

    private void startHomeActivity() {
        Intent  intent1 = new Intent( this,HomeActivity.class);
        //intent.putExtra(UtilsClass.NAME_LOGIN, "Sgsits Coming..");
        startActivity(intent1);
    }


}
