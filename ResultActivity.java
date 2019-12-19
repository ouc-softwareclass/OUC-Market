package com.lenovo.myoucapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lenovo.myoucapp.R;

/*
搜索结果跳转页面或猜你想要点击跳转后的页面
 */
public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_result );
    }
}
