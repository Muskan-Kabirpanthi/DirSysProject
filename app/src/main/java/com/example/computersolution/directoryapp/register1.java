
package com.example.computersolution.directoryapp;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.Toast;
public class register1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.register1);

        try {

            String s = getIntent().getExtras().getString(UtilsClass.NAME_LOGIN);
            String ss = getIntent().getStringExtra(UtilsClass.NAME_LOGIN);
            Toast.makeText(register1.this, ss, Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(register1.this, "Error Occur!!", Toast.LENGTH_LONG).show();
        }

    }

}