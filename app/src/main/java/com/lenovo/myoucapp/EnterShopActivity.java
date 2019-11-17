package com.lenovo.myoucapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EnterShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_shop);


    }
    public static void actionStart(Context context){
        Intent intent = new Intent(context, EnterShopActivity.class);
        context.startActivity(intent);
    }

}
