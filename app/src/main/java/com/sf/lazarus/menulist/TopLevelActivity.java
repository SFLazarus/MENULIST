package com.sf.lazarus.menulist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        AdapterView.OnItemClickListener onItemClickListener=new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> listview, View v, int position, long id) {
                if(position==0){
                    Intent intent=new Intent(TopLevelActivity.this,FoodCategoryActivity.class);
                    startActivity(intent);
                }

            }
        };

        ListView listView=(ListView) findViewById(R.id.listOptions);
        listView.setOnItemClickListener(onItemClickListener);
    }
}
