package com.example.rainb.momota;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener {

    private Button buttonMap,buttonTask,butttonHealth,buttonCalculator,buttonFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttonMap=(Button)findViewById(R.id.buttonMap);
        buttonTask=(Button)findViewById(R.id.buttonTask);
        butttonHealth=(Button)findViewById(R.id.buttonHealth);
        buttonCalculator=(Button)findViewById(R.id.buttonCalculator);
        buttonFood=(Button)findViewById(R.id.buttonFood);

        butttonHealth.setOnClickListener(this);
        buttonMap.setOnClickListener(this);
        buttonTask.setOnClickListener(this);
        buttonCalculator.setOnClickListener(this);
        buttonFood.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.buttonMap:
                finish();
                startActivity(new Intent(this,MapsActivity.class));
                break;
            case R.id.buttonTask:
                finish();
                startActivity(new Intent(this,MonthlyTasks.class));
                break;
            case R.id.buttonHealth:
                Intent launchIntent=getPackageManager().getLaunchIntentForPackage("com.menthoven.arduinoandroid");
                startActivity(launchIntent);
                break;
            case R.id.buttonCalculator:
                finish();
                startActivity(new Intent(this,Calculator.class));
                break;
            case R.id.buttonFood:
                finish();
                startActivity(new Intent(this,FoodActivity.class));
                break;


        }
    }


}
