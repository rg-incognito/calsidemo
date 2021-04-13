package com.example.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Alllist extends AppCompatActivity {
    ListView simplelist;
    String[] options;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alllist);
        simplelist=findViewById(R.id.listview);
        options= new String[]{"Calculator","Percentage calculator"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,options);
        simplelist.setAdapter(arrayAdapter);
        simplelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent i = new Intent(Alllist.this,Calsi.class);
                    startActivity(i);
                }

            }
        });

    }
}