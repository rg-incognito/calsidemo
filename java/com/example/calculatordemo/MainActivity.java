package com.example.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText uname,pass;
    Button lbtn;
    String usernamed,passwardd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=findViewById(R.id.username);
        pass=findViewById(R.id.passward);
        lbtn=findViewById(R.id.loginbtn);
        usernamed="Admin";
        passwardd="Admin";


        lbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (uname.getText().toString().equals("")){
                    uname.setError("Enter you userid");
                }else if (pass.getText().toString().equals("")){
                    pass.setError("Enter you userid");
                }else{
                    if (uname.getText().toString().equals(usernamed) && pass.getText().toString().equals(passwardd)){
                        Intent intent=new Intent(MainActivity.this,Alllist.class);
                        startActivity(intent);
                        finish();


                    }
                }

            }
        });




    }
}