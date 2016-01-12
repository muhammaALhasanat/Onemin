package com.example.basel.onemin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by basel on 1/8/2016.
 */
public class splash extends Activity {
    private final int SPLASH_DISPLAY_LENGTH=300;

    @Override
    public void onCreate(Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i =new Intent(splash.this,MainActivity.class);
                splash.this.startActivity(i);
                splash.this.finish();
            }

        },SPLASH_DISPLAY_LENGTH);
    }}

