package com.example.thefirstpillar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.textclassifier.TextClassification;
import android.widget.ImageView;
import android.widget.TextView;


public class splash_activity extends AppCompatActivity {
     private static int SPLASH_SCREEN = 4000;

    //variables
    Animation topAnim, bottomAnim;

    TextView tittle, text;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_activity);

        tittle = findViewById(R.id.txtTittle);
        logo=  findViewById(R.id.theLogo);
        text = findViewById(R.id.txtKanon);



        //animation
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        logo.setAnimation(topAnim);
        tittle.setAnimation(bottomAnim);
        text.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intentSplashScreen = new Intent(splash_activity.this, dashboard.class);
                startActivity(intentSplashScreen);
                finish();
            }
            },SPLASH_SCREEN);






    }
}