package com.example.lyw.mylistviews.holder;

import android.view.View;
import android.widget.TextView;

import com.example.lyw.mylistviews.R;
import com.example.lyw.mylistviews.UIUtils;


/**
 * holder
 * 
 * @author
 * @date
 */
public class HomeHolder extends BaseHolder<String> {

	private TextView tvName;


	@Override
	public View initView() {
		// 1. 加载布局
		View view = UIUtils.inflate(R.layout.list_item_home);
		// 2. 初始化控件
		tvName = (TextView) view.findViewById(R.id.tv_name);
		return view;
	}

	@Override
	public void refreshView(String data) {
		tvName.setText(data.toString());

	}

}
