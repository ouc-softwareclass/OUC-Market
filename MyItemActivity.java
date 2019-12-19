<<<<<<< HEAD
package com.lenovo.myoucapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_my_item );
        Button button_enter_shop = (Button) findViewById(R.id.button_enter_shop);
        button_enter_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                EnterShopActivity.actionStart(MyItemActivity.this);
            }
        });
        TextView shop_name = (TextView) findViewById(R.id.shop_name);
    }
    public static void actionStart(Context context){
        Intent intent = new Intent(context, MyItemActivity.class);
        context.startActivity(intent);
    }
}
=======
package com.lenovo.myoucapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_my_item );
        Button button_enter_shop = (Button) findViewById(R.id.button_enter_shop);
        button_enter_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                EnterShopActivity.actionStart(MyItemActivity.this);
            }
        });
        TextView shop_name = (TextView) findViewById(R.id.shop_name);
    }
    public static void actionStart(Context context){
        Intent intent = new Intent(context, MyItemActivity.class);
        context.startActivity(intent);
    }
}
>>>>>>> search
