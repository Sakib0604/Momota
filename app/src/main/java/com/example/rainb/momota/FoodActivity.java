package com.example.rainb.momota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }
    public void onBackPressed()
    {
        finish();
        startActivity(new Intent(this,Home.class));
    }
}
