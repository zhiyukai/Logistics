package com.zbar.lib.activity;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.zbar.lib.R;
import com.zbar.lib.common.BaseActivity;

/**
 * @author zsj
 * @date 2016年7月7日下午4:40:17
 * @function
 */

public class SearchResultActivity extends BaseActivity {

	@Override
	public void setContentView() {
		setContentView(R.layout.activity_search_result);
		((TextView) findViewById(R.id.tv_content)).setText(getResources()
				.getString(R.string.search_result));
	}

	@Override
	public void initView() {

	}

	@Override
	public void initListeners() {
		findViewById(R.id.iv_back).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}

	@Override
	public void initData() {

	}

}
