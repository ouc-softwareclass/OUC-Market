package com.lenovo.myoucapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lenovo.myoucapp.R;

import java.util.List;
/*
商品类=图片+描述信息+价格
适配器
 */

public class Commodity_adapter extends ArrayAdapter<Commodity> {
    private int resourceId;
    public Commodity_adapter(Context context, int resource, List<Commodity> objects) {
        super(context, resource, objects);
        resourceId=resource;
        //后期修改为从数据库中提取
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Commodity com=getItem(position);
        View view;

        //优化效率
        if(convertView == null){
            view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

        }
        else{
            view = convertView;
        }
       //
        ImageView commodityImage = (ImageView)view.findViewById( R.id.commodity_image );
        TextView commodityText = (TextView)view.findViewById(R.id.commodity_name );
        TextView commodityPrice = (TextView)view.findViewById( R.id.commodity_price );
        commodityImage.setImageResource(com.getImageId());
        commodityText.setText(com.getName());
        commodityPrice.setText( com.getPrice() );
        return view;
    }
}
