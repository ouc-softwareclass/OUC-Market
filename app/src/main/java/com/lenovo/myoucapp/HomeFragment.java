package com.lenovo.myoucapp;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.lenovo.myoucapp.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * 主页面，搜索+推荐
 */
public class HomeFragment extends Fragment
        implements SearchView.OnQueryTextListener, AdapterView.OnItemClickListener {

    private List<Commodity> commodityList = new ArrayList<>();
    private ListView comResult;

    private SearchView searchview;
    private ListView searchResult;
    //数据库
    private String[] search_data = {"游戏机", "二手课本", "辅导习题", "ershou", "sse", "ssa", "ssd"};
    //
    private List<String> result = new ArrayList<String>();
    private ArrayAdapter<String> search_adapter;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        super.onStart();
        //搜索列表初始化
        searchview = (SearchView) getView().findViewById( R.id.search_view );
        searchview.setSubmitButtonEnabled( true );
        searchview.setIconifiedByDefault( false );
        searchview.setOnQueryTextListener( this );
        searchResult = (ListView) getView().findViewById( R.id.search_result );
        search_adapter = new ArrayAdapter<String>( getContext(), android.R.layout.simple_list_item_1, result );
        searchResult.setAdapter( search_adapter );
        searchResult.setOnItemClickListener( this );
        //猜你想要  初始化
        initCommodity();
        Commodity_adapter commodityAdapter = new Commodity_adapter( getContext(), R.layout.commodity_list,
                commodityList );
        comResult = (ListView) getView().findViewById( R.id.comResult );
        comResult.setAdapter( commodityAdapter );
        comResult.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent( getActivity(), ResultActivity.class );
                startActivity( intent );
            }
        } );
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_home, container, false );
    }

    //单击搜索按钮后
    @Override
    public boolean onQueryTextSubmit(String query) {
        result.clear();
        for (String s : search_data) {
            if (s.toLowerCase().indexOf( query.toLowerCase() ) >= 0)
                result.add( s );
        }
        search_adapter.notifyDataSetChanged();
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }

    //搜索结果可点击，实现跳转
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (id >= 0) {
            String s = result.get( (int) id );
            //得到搜索的结果
            Toast t;
            t = (Toast) Toast.makeText( getContext(), "您点击了" + s, Toast.LENGTH_SHORT );
            t.show();
            Intent intent = new Intent( getActivity(), SearchActivity.class );
            startActivity( intent );
        }
    }
    //数据库
    private void initCommodity() {
        for (int i = 0; i < 5; i++) {
            Commodity a = new Commodity( "shufa", R.drawable.a1,"50r" );
            commodityList.add( a );
            Commodity b = new Commodity( "shux", R.drawable.a2,"300r" );
            commodityList.add( b );
            Commodity c = new Commodity( "xsg", R.drawable.a3,"90r" );
            commodityList.add( c );
        }
    }



}
