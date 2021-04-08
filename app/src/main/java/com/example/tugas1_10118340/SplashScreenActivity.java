package com.example.tugas1_10118340;
//8 April 2021
//10118340 - Muhammad Umar Al Fajar

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent LoginActivity=new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(LoginActivity);
                finish();

            }
        },waktu_loading);
    }
}