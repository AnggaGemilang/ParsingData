package com.example.parsingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textview = (TextView) findViewById(R.id.tempel);
        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString("DataSaya");
        textview.setText("Halo, " + text);
    }
}
