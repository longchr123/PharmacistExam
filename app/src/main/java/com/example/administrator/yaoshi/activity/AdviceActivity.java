package com.example.administrator.yaoshi.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.yaoshi.R;
import com.umeng.analytics.MobclickAgent;

public class AdviceActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView iv_back;
    private EditText et_content;
    private Button bt_tijiao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);
        initView();
        initListener();
    }

    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }

    private void initListener() {
        iv_back.setOnClickListener(this);
        bt_tijiao.setOnClickListener(this);
    }

    private void initView() {
        iv_back = (ImageView) findViewById(R.id.iv_back);
        et_content = (EditText) findViewById(R.id.et_content);
        bt_tijiao = (Button) findViewById(R.id.bt_tijiao);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.bt_tijiao:
                Toast.makeText(this, "提交成功，谢谢！", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
    }
}
