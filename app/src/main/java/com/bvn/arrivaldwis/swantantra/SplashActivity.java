package com.bvn.arrivaldwis.swantantra;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.LinearLayout;


public class SplashActivity extends Activity {

    private static final long SPLASH_DISPLAY_LENGHT = 3000;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);
        LinearLayout ll2 = (LinearLayout) findViewById(R.id.ll);
        ll2.setBackground(getApplicationContext().getResources().getDrawable(R.drawable.splash));
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                finish();
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        }, SPLASH_DISPLAY_LENGHT);
    }
}
