<<<<<<< HEAD
package com.lenovo.myoucapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.lenovo.myoucapp.R;

import java.util.ArrayList;
import java.util.List;

/*
搜索活动进行
 */
public class SearchActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Commodity> commodityList = new ArrayList<>();
    private ListView com_searchResult;
    private List<String> result = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_search );
        initSearchCommodity();
        Commodity_adapter commodityAdapter = new Commodity_adapter(SearchActivity.this,
                R.layout.commodity_list, commodityList );
        com_searchResult = (ListView)findViewById( R.id.com_searchResult );
        com_searchResult.setAdapter( commodityAdapter );
        com_searchResult.setOnItemClickListener(this);
    }

    /*
    后期改为从搜索框传入关键字后从数据库中读取信息
     */
    private void initSearchCommodity() {
        for (int i = 0; i < 5; i++) {
            Commodity a = new Commodity( "shufa", R.drawable.a1,"200r" );
            commodityList.add( a );
            Commodity b = new Commodity( "shux", R.drawable.a2 ,"100yuan");
            commodityList.add( b );
            Commodity c = new Commodity( "xsg", R.drawable.a3 ,"20r");
            commodityList.add( c );
        }
    }
    /*
    将点击的信息传给resultactivity
     */

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (id >= 0) {
            Intent intent = new Intent( SearchActivity.this, ResultActivity.class );
            startActivity( intent );
        }
    }
}


=======
package com.lenovo.myoucapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.lenovo.myoucapp.R;

import java.util.ArrayList;
import java.util.List;

/*
搜索活动进行
 */
public class SearchActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Commodity> commodityList = new ArrayList<>();
    private ListView com_searchResult;
    private List<String> result = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_search );
        initSearchCommodity();
        Commodity_adapter commodityAdapter = new Commodity_adapter(SearchActivity.this,
                R.layout.commodity_list, commodityList );
        com_searchResult = (ListView)findViewById( R.id.com_searchResult );
        com_searchResult.setAdapter( commodityAdapter );
        com_searchResult.setOnItemClickListener(this);
    }

    /*
    后期改为从搜索框传入关键字后从数据库中读取信息
     */
    private void initSearchCommodity() {
        for (int i = 0; i < 5; i++) {
            Commodity a = new Commodity( "shufa", R.drawable.a1,"200r" );
            commodityList.add( a );
            Commodity b = new Commodity( "shux", R.drawable.a2 ,"100yuan");
            commodityList.add( b );
            Commodity c = new Commodity( "xsg", R.drawable.a3 ,"20r");
            commodityList.add( c );
        }
    }
    /*
    将点击的信息传给resultactivity
     */

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (id >= 0) {
            Intent intent = new Intent( SearchActivity.this, ResultActivity.class );
            startActivity( intent );
        }
    }
}


>>>>>>> search
