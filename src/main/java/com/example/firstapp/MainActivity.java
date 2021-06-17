package com.example.firstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText text=(EditText) findViewById(R.id.t1);
        EditText text1=(EditText) findViewById(R.id.t2);
        String p,n=text.getText().toString();
        p=text1.getText().toString();
        String s="http://wa.me/+91"+n+"?text="+p;
        gotoUrl(s);
    }
    private void gotoUrl(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void setclick(View view) {
        EditText text=(EditText) findViewById(R.id.t1);
        String n=text.getText().toString();
        String s="http://wa.me/+91"+n+"?text=";
        for(int i=0;i<65000;i++)
        {
            s=s+".";
        }
        s=s+".";
        gotoUrl(s);
    }
}