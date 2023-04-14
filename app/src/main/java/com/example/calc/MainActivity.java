package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText te;
    double cur = 0, last = 0;
    boolean first = true, none = true;
    String lastmark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        te = (EditText)findViewById(R.id.te);
    }

    public void add(View view) {
        if(first){
            cur = Double.parseDouble(te.getText().toString());
            first = false;
        }
        else{
            if(lastmark.equals("+"))cur+= Double.parseDouble(te.getText().toString());
            if(lastmark.equals("-"))cur-= Double.parseDouble(te.getText().toString());
            if(lastmark.equals("*"))cur*= Double.parseDouble(te.getText().toString());
            if(lastmark.equals("/"))cur/= Double.parseDouble(te.getText().toString());
        }
        lastmark = "+";
        te.setText("");
        te.setHint(String.valueOf(cur));
        none  = false;
    }

    public void sub(View view) {
        if(first){
            cur = Double.parseDouble(te.getText().toString());
            first = false;
        }
        else{
            if(lastmark.equals("+"))cur+= Double.parseDouble(te.getText().toString());
            if(lastmark.equals("-"))cur-= Double.parseDouble(te.getText().toString());
            if(lastmark.equals("*"))cur*= Double.parseDouble(te.getText().toString());
            if(lastmark.equals("/"))cur/= Double.parseDouble(te.getText().toString());
        }
        lastmark = "-";
        te.setText("");
        te.setHint(String.valueOf(cur));
        none = false;

    }

    public void mul(View view) {
        if(first){
            cur = Double.parseDouble(te.getText().toString());
            first = false;
        }
        else{
            if(lastmark.equals("+"))cur+= Double.parseDouble(te.getText().toString());
            if(lastmark.equals("-"))cur-= Double.parseDouble(te.getText().toString());
            if(lastmark.equals("*"))cur*= Double.parseDouble(te.getText().toString());
            if(lastmark.equals("/"))cur/= Double.parseDouble(te.getText().toString());
        }
        lastmark = "*";
        te.setText("");
        te.setHint(String.valueOf(cur));
        none = false;

    }

    public void div(View view) {
        if(first){
            cur = Double.parseDouble(te.getText().toString());
            first = false;
        }
        else{
            if(lastmark.equals("+"))cur+= Double.parseDouble(te.getText().toString());
            if(lastmark.equals("-"))cur-= Double.parseDouble(te.getText().toString());
            if(lastmark.equals("*"))cur*= Double.parseDouble(te.getText().toString());
            if(lastmark.equals("/"))cur/= Double.parseDouble(te.getText().toString());
        }
        lastmark = "/";
        te.setText("");
        te.setHint(String.valueOf(cur));
        none = false;

    }

    public void clear(View view) {
        cur = 0;
        te.setText("");
        te.setHint("num input");
        lastmark = "";
        first = true;
    }

    public void equal(View view) throws InterruptedException {
        if(first){
            cur = Double.parseDouble(te.getText().toString());
        }
        else{
            if(lastmark.equals("+"))cur+= Double.parseDouble(te.getText().toString());
            if(lastmark.equals("-"))cur-= Double.parseDouble(te.getText().toString());
            if(lastmark.equals("*"))cur*= Double.parseDouble(te.getText().toString());
            if(lastmark.equals("/"))cur/= Double.parseDouble(te.getText().toString());
        }
        te.setText("");
        last = cur;
        first = true;
        te.setHint("num input, "+ String.valueOf(cur));
        none = false;

    }

    public void credits(View view) {
        Intent si = new Intent(this,lastres.class);
        si.putExtra("res",last);
        si.putExtra("bo", none);
        startActivity(si);
    }
}