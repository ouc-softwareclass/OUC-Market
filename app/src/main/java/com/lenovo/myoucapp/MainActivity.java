package com.lenovo.myoucapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;


import com.lenovo.myoucapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/*
承载底部导航栏
 */
public class MainActivity extends AppCompatActivity
         {
    //底部导航栏
    private FragmentTransaction transaction;
    private FragmentManager fragmentManager;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            fragmentManager = getSupportFragmentManager();
            transaction = fragmentManager.beginTransaction();
            //使用fragmentmanager和transaction来实现切换效果

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    transaction.replace(R.id.container,new HomeFragment());
                    transaction.commit();
                    return true;
                case R.id.navigation_dashboard:
                    transaction.replace(R.id.container,new My_Fragment());
                    transaction.commit();
                    return true;
                case R.id.navigation_notifications:
                    transaction.replace(R.id.container,new Shop_Fragment());
                    transaction.commit();
                    return true;
            }
            return false;
        }
    };

    private void setDefaultFragment(){
        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container,new HomeFragment());
        transaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        BottomNavigationView navView = findViewById( R.id.nav_view );
        navView.setOnNavigationItemSelectedListener( mOnNavigationItemSelectedListener );
        setDefaultFragment();


        Comment comment = new Comment( 1,1,"ss" );
       // System.out.println( comment.getTime()+"!!!!!" );
        Log.v("MainActivity",comment.getTime()+"!!");

    }



}
