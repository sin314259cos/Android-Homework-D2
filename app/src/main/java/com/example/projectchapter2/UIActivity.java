package com.example.projectchapter2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class UIActivity extends AppCompatActivity {

    private static final String TAG = "TAG";
//    private ViewPager mSimpleviewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        Log.i(TAG, "UI onCreate");
        initView();
    }

    private void initView() {
        @SuppressLint("WrongViewCast") ImageButton btn_back =findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new  Intent();
                intent2.setComponent(new ComponentName(UIActivity.this, MainActivity.class));
                startActivity(intent2);
            }
        });
//        mSimpleviewpager = (ViewPager)findViewById(R.id.Adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "UIActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "UIActivity onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "UIActivity onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "UIActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "UIActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "UIActivity onDestroy");
    }
}

