package com.lenovo.myoucapp;

<<<<<<< HEAD
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
=======
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
>>>>>>> search
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
<<<<<<< HEAD
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_item);
=======
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_my_item );
>>>>>>> search
        Button button_enter_shop = (Button) findViewById(R.id.button_enter_shop);
        button_enter_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                EnterShopActivity.actionStart(MyItemActivity.this);
            }
        });
        TextView shop_name = (TextView) findViewById(R.id.shop_name);
<<<<<<< HEAD


=======
>>>>>>> search
    }
    public static void actionStart(Context context){
        Intent intent = new Intent(context, MyItemActivity.class);
        context.startActivity(intent);
    }
<<<<<<< HEAD

=======
>>>>>>> search
}
