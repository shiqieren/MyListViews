package com.example.lyw.mylistviews.activity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.lyw.mylistviews.R;
import com.example.lyw.mylistviews.adapter.MyBaseAdapter;
import com.example.lyw.mylistviews.holder.BaseHolder;
import com.example.lyw.mylistviews.holder.HomeHolder;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    // 条目
    private ArrayList<String> data;
    private ListView view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //数据初始化
        data = new ArrayList();
        for (int i = 0; i < 10; i++) {
            data.add("当前i：" + i);
        }

        //获取listview
        //自定义   MyListView view = new MyListView(UIUtils.getContext());
        view = (ListView) findViewById(R.id.lv_1);

        view.setAdapter(new HomeAdapter(data));


    }


    class HomeAdapter extends MyBaseAdapter<String> {

        public HomeAdapter(ArrayList<String> data) {
            super(data);
        }

        @Override
        public BaseHolder<String> getHolder(int position) {
            return new HomeHolder();
        }

        // 此方法在子线程调用
        @Override
        public ArrayList<String> onLoadMore() {
            ArrayList<String> moredata  = new ArrayList();
            for (int i = 10; i < 100; i++) {
                moredata.add("当前i：" + i);
            }
            return moredata;
        }


    }


}
