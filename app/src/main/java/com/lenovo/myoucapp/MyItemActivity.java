package com.lenovo.myoucapp;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyItemActivity extends AppCompatActivity {
    String TABLENAME = "iteminfo";
    byte[] imagedata;
    Bitmap imagebm; //图片类型必须是Bitmap
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_item);
        final DatabaseHelper dbtest = new DatabaseHelper(this);
        final Intent intent = getIntent();
        final SQLiteDatabase db = dbtest.getWritableDatabase();
        ImageView image = (ImageView)findViewById(R.id.item_photo);
        TextView title = (TextView) findViewById(R.id.item_name);
        TextView price = (TextView)findViewById(R.id.item_price);
        TextView intro = (TextView) findViewById(R.id.item_introduce);
        TextView contact = (TextView) findViewById(R.id.contact);
        Button button_return = (Button) findViewById(R.id.button_return);
        Cursor cursor = db.query(TABLENAME,null,"id=?",new String[]{intent.getStringExtra("id")},null,null,null,null); // 根据接收到的id进行数据库查询
        Log.i("商品的id是",intent.getStringExtra("id"));
        if (cursor.moveToFirst()){
            while (!cursor.isAfterLast()){
                imagedata = cursor.getBlob(6);
                imagebm = BitmapFactory.decodeByteArray(imagedata, 0, imagedata.length);
                image.setImageBitmap(imagebm);//把图片从数据库加载到image
                title.setText(cursor.getString(2));
                intro.setText(cursor.getString(4));
                price.setText(cursor.getString(5));
                contact.setText(cursor.getString(7));
                cursor.moveToNext();
            }
            cursor.close();
        }
        button_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UploadItemActivity.actionStart(MyItemActivity.this);
            }
            });
    }

    public static void actionStart(Context context){
        Intent intent = new Intent(context, MyItemActivity.class);
        context.startActivity(intent);
    }

}
