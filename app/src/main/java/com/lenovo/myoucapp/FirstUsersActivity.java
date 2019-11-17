package com.lenovo.myoucapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstUsersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_first_layout);
        Button button_enter_shop = (Button) findViewById(R.id.button_enter_shop);
        button_enter_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                EnterShopActivity.actionStart(FirstUsersActivity.this);
            }
        });
        TextView shop_name = (TextView) findViewById(R.id.shop_name);


    }
    public static void actionStart(Context context){
        Intent intent = new Intent(context, FirstUsersActivity.class);
        context.startActivity(intent);
    }

}
