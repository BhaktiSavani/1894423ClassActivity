package com.example.a1894423.a1894423classactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.design.widget.Snackbar;
public class MainActivity extends AppCompatActivity {

    EditText edit_name,edt_email,edt_pass,edt_lname;
    Button btnsub,btnclear;
    String TAG="Information::";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_name = findViewById(R.id.edtname);
        edt_lname = findViewById(R.id.edtlname);
        edt_email = findViewById(R.id.edtemail);
        edt_pass = findViewById(R.id.edtpass);

        btnsub =findViewById(R.id.btnsub);
        btnclear =findViewById(R.id.btnclear);


        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=edit_name.getText().toString();
                String email=edt_email.getText().toString();
                String pass=edt_pass.getText().toString();
                String msg ="Thank you";



                Log.v(TAG,name);
                Log.v(TAG,email);
                Log.v(TAG,pass);

                Toast.makeText(getApplicationContext(),edit_name.getText().toString()+msg.toString(),Toast.LENGTH_SHORT).show();
                Snackbar.make(v, "Submitted", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        }


        );
       btnclear.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {


                                     finish();
                            System.exit(0);
                                   }
                             }

     );
    }
}
