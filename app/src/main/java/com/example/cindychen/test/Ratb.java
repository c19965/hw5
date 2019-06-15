package com.example.cindychen.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.Toast;

public class Ratb extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ratt);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
@Override
public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        String text = rating + " star(s)";
        Toast.makeText(Ratb.this, text, Toast.LENGTH_SHORT).show();
        }
        });
        }

        }

