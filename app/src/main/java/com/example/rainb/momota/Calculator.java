package com.example.rainb.momota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    EditText lastDate;
    Button calculate;
    TextView resultDate;

    public void onBackPressed()
    {
        finish();
        startActivity(new Intent(this,Home.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        lastDate=(EditText)findViewById(R.id.lastDate);
        calculate=(Button)findViewById(R.id.calculate);
        resultDate=(TextView)findViewById(R.id.resulDate);

        calculate.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.calculate:
                String date=lastDate.getText().toString();
                SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                Calendar c= Calendar.getInstance();
                try {
                    c.setTime(sdf.parse(date));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                c.add(Calendar.DATE,280);

                SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");

                String output=sdf1.format(c.getTime());
                resultDate.setText(output);
                break;
        }
    }
}
