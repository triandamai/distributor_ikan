package com.distributor_ikan;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.distributor_ikan.pembeli.dashboard_pembeli;

public class splash_screen extends AppCompatActivity {
    //TODO:: halaman loading
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splash_screen.this,dashboard_pembeli.class));
            }
        });
    }
}
