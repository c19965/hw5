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

        /*
        Bundle bndl = new Bundle();
        bndl.putDouble("height",height);
        bndl.putString("sex",sex);

        intent.putExtras(bndl);
        */
    }
}


