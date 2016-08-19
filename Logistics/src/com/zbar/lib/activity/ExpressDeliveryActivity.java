package com.zbar.lib.activity;

import android.widget.TextView;

import com.zbar.lib.R;
import com.zbar.lib.common.BaseActivity;

/**
 * @author zsj
 * @date 2016年7月11日下午7:28:03
 * @function
 */

public class ExpressDeliveryActivity extends BaseActivity {

	private TextView mContentTV;
	private TextView mRightTV;

	@Override
	public void setContentView() {
		setContentView(R.layout.activity_express_delivery);
	}

	@Override
	public void initView() {

		mContentTV.setText(getResources().getString(R.string.express_delivery));
		mContentTV.setTextColor(getResources().getColor(R.color.a69_black));
		mRightTV.setText(getResources().getString(
				R.string.nearby_services_window));
		mRightTV.setTextColor(getResources().getColor(R.color.main_tab_color_1));
		mRightTV.setTextSize(getResources().getDimension(R.dimen.font_size_12));
	}

	@Override
	public void initListeners() {

	}

	@Override
	public void initData() {

	}

}
