package com.example.jeetendraachtani.tabsexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.crashlytics.android.Crashlytics;
import com.example.jeetendraachtani.tabsexample.Analytics.Main2Activity;
import com.example.jeetendraachtani.tabsexample.BottomBar.ActWelcomeBottomBar;
import com.example.jeetendraachtani.tabsexample.IntroScreens.SplashActivity;

import io.fabric.sdk.android.Fabric;

public class ActWelcome extends AppCompatActivity {

    Button btn_tab,btn_settings,btn_analytics,btn_intro,btn_bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_act_welcome);
        btn_tab=findViewById(R.id.btn_tab);
        btn_settings=findViewById(R.id.btn_settings);
        btn_analytics=findViewById(R.id.btn_analytics);
        btn_intro=findViewById(R.id.btn_intro);
        btn_bottomBar=findViewById(R.id.btn_bottomBar);
        btn_tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActWelcome.this, MainActivity.class));
            }
        });
        btn_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActWelcome.this, ActSettings.class));
            }
        });
        btn_analytics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActWelcome.this, Main2Activity.class));
            }
        });
        btn_intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActWelcome.this, SplashActivity.class));
            }
        });
        btn_bottomBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActWelcome.this, ActWelcomeBottomBar.class));
            }
        });
    }
}
