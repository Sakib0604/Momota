package com.example.rainb.momota;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    Thread t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread t=new Thread(){
            @Override
            public void run() {
                super.run();
                try{
                    sleep(3000);
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent e=new Intent(SplashActivity.this,login.class);
                    startActivity(e);
                    finish();
                }

            }
        };
        t.start();
    }

}
