package com.lenovo.myoucapp;

<<<<<<< HEAD
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
=======
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
>>>>>>> search

public class EnterShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
<<<<<<< HEAD
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_shop);


=======
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_enter_shop );
>>>>>>> search
    }
    public static void actionStart(Context context){
        Intent intent = new Intent(context, EnterShopActivity.class);
        context.startActivity(intent);
    }
<<<<<<< HEAD

=======
>>>>>>> search
}
