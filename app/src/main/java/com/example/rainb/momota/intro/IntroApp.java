package com.example.rainb.momota.intro;

/**
 * Created by rainb on 24-Nov-17.
 */

import android.app.Application;
public class IntroApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Globals.init(this);
    }
}
