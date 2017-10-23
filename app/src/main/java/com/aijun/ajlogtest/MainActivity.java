package com.aijun.ajlogtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aijun.ajlog.AJLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AJLog.log();
    }
}
