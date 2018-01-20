package com.example.user.primeraapp.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner list;
    String dates = ("Menu");

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list = (Spinner)findViewById(R.id.list);

        ArrayAdapter<String> adapter=(new ArrayAdapter<String>(this,android.R.layout.simple_Spinner_item, dates));
        list.setAdapter(adapter);


    }
}
