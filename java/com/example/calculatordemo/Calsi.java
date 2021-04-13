package com.example.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calsi extends AppCompatActivity {
    EditText num1,num2;
    TextView answer;
    Button addition,subt,mult,divt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calsi);
        num1=findViewById(R.id.firstnum);
        num2=findViewById(R.id.secondnum);
        answer=findViewById(R.id.answer);
        addition=findViewById(R.id.add);
        subt=findViewById(R.id.sub);
        mult=findViewById(R.id.mul);
        divt=findViewById(R.id.div);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i=Integer.parseInt(num1.getText().toString());
                int j=Integer.parseInt(num2.getText().toString());
                int res=i+j;
                String ress=String.valueOf(res);
                Log.d("Hii", "onClick: "+ress);
                answer.setText(ress);

            }
        });
            subt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=Integer.parseInt(num1.getText().toString());
                int j=Integer.parseInt(num2.getText().toString());
                int res=i-j;
                String ress=String.valueOf(res);
                Log.d("Hii", "onClick: "+ress);
                answer.setText(ress);

            }
        });
            mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=Integer.parseInt(num1.getText().toString());
                int j=Integer.parseInt(num2.getText().toString());
                int res=i*j;
                String ress=String.valueOf(res);
                Log.d("Hii", "onClick: "+ress);
                answer.setText(ress);

            }
        });
            divt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=Integer.parseInt(num1.getText().toString());
                int j=Integer.parseInt(num2.getText().toString());
                int res=i/j;
                String ress=String.valueOf(res);
                Log.d("Hii", "onClick: "+ress);
                answer.setText(ress);

            }
        });


    }
}