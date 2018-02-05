package com.example.point.myapplication;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.example.point.myapplication.R;


public class SplashScreen extends AppCompatActivity {
    LinearLayout a1;
    Animation uptodown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        a1 = (LinearLayout) findViewById(R.id.a1);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        a1.setAnimation(uptodown);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },5*1000);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();


    }
}
