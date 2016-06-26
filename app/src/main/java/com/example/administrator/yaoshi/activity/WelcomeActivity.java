package com.example.administrator.yaoshi.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.yaoshi.MainActivity;
import com.example.administrator.yaoshi.R;
import com.example.administrator.yaoshi.util.ConfigUtil;
import com.umeng.analytics.MobclickAgent;

import java.util.Timer;
import java.util.TimerTask;

import cn.jpush.android.api.JPushInterface;

public class WelcomeActivity extends AppCompatActivity {
    private SharedPreferences sp;
    private String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        JPushInterface.init(this);
        sp = getSharedPreferences(ConfigUtil.spSave, Activity.MODE_PRIVATE);
        number = sp.getString("number", "");
        final Intent intent1 = new Intent(this, MainActivity.class);
        final Intent intent2 = new Intent(this, CreateActivity.class);
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (!number.equals("")) {
                    startActivity(intent1);
                } else {
                    startActivity(intent2);
                }
                finish();
            }
        };
        timer.schedule(task, 1000 * 1);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
        JPushInterface.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
        JPushInterface.onPause(this);
    }
}
