package com.example.lyw.mylistviews;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by lyw on 2017/7/6.
 */

abstract class MyBaseAdapter extends BaseAdapter {

    //注意: 此处必须要从0开始写
    private static final int TYPE_NORMAL = 0;// 正常布局类型
    private static final int TYPE_MORE = 1;// 加载更多类型

    int a[]={};
    public MyBaseAdapter(){
        for(int i= 0;i<100;i++){
            a[i]=i;
        }
    }

    /*
    构造方法传入数据，泛型！

    private ArrayList<T> data;

    public MyBaseAdapter(ArrayList<T> data) {
        this.data = data;
    }*/
    @Override
    public int getCount() {
        return a.length;
    }

    @Override
    public Object getItem(int i) {
        return "当前位置："+a[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }



    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        if (convertView == null) {
            // 1. 加载布局文件
            // 2. 初始化控件 findViewById
            // 3. 打一个标记tag


        } else {

        }
        // 4. 根据数据来刷新界面
        // 加载更多布局
        // 一旦加载更多布局展示出来, 就开始加载更多
        // 只有在有更多数据的状态下才加载更多
        return null;
    }


}
