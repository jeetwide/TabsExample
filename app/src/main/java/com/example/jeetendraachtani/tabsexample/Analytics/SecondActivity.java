package com.example.jeetendraachtani.tabsexample.Analytics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.jeetendraachtani.tabsexample.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyApplication.getInstance().trackScreenView("Second Screen");
    }
}
