package com.example.cindychen.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scrollView(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Scroll.class);
        startActivity(intent);
    }

    public void webv(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Web.class);
        startActivity(intent);
    }

    public void ratv(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Ratb.class);
        startActivity(intent);
    }

    public void seekv(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Seek.class);
        startActivity(intent);
    }

    public void combound(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Cpd.class);
        startActivity(intent);
    }

    public void menunu(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Menus.class);
        startActivity(intent);
    }

    public void spinn(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Spinner.class);
        startActivity(intent);
    }
}


