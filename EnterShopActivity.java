<<<<<<< HEAD
package com.lenovo.myoucapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class EnterShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_enter_shop );
    }
    public static void actionStart(Context context){
        Intent intent = new Intent(context, EnterShopActivity.class);
        context.startActivity(intent);
    }
}
=======
package com.lenovo.myoucapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class EnterShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_enter_shop );
    }
    public static void actionStart(Context context){
        Intent intent = new Intent(context, EnterShopActivity.class);
        context.startActivity(intent);
    }
}
>>>>>>> search
