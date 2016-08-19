package com.zbar.lib.activity;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

import com.zbar.lib.R;
import com.zbar.lib.common.BaseActivity;

/**
 * @author zsj
 * @date 2016年7月4日下午10:49:44
 * @function
 */

public class RegisterActivity extends BaseActivity {
	private EditText mNameET;
	private EditText mPassET;
	private EditText mChecknumET;

	@Override
	public void setContentView() {
		setContentView(R.layout.activity_register);
	}

	@Override
	public void initView() {
		((TextView) findViewById(R.id.tv_content)).setText(getResources()
				.getString(R.string.register));
		mNameET = (EditText) findViewById(R.id.et_input_num);
		mPassET = (EditText) findViewById(R.id.et_input_pass);
		mChecknumET = (EditText) findViewById(R.id.et_input_checknum);
	}

	@Override
	public void initListeners() {
		findViewById(R.id.iv_back).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});
		findViewById(R.id.tv_checknum).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
					}
				});
		findViewById(R.id.tv_register).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
					}
				});
	}

	@Override
	public void initData() {

	}

}
