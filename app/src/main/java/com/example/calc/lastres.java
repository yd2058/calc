package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class lastres extends AppCompatActivity {
    Intent gi;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lastres);
        tv = (TextView)findViewById(R.id.tv);
        gi = getIntent();
        tv.setText("last result is: " + gi.getDoubleExtra("res",1));

    }

    public void ret(View view) {
        finish();
    }
}