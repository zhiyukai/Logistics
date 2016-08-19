package com.zbar.lib.activity;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

import com.zbar.lib.R;
import com.zbar.lib.common.BaseActivity;

/**
 * @author zsj
 * @date 2016年7月5日下午8:53:07
 * @function
 */

public class LoginActivity extends BaseActivity {

	private EditText mNameET;
	private EditText mPassET;
	private int mSecletNum;

	@Override
	public void setContentView() {
		setContentView(R.layout.activity_login);
	}

	@Override
	public void initView() {
		((TextView) findViewById(R.id.tv_content)).setText(getResources()
				.getString(R.string.index_login));
		mNameET = (EditText) findViewById(R.id.et_input_num);
		mPassET = (EditText) findViewById(R.id.et_input_pass);
	}

	@Override
	public void initListeners() {
		findViewById(R.id.iv_back).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});
		findViewById(R.id.tv_login).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		});
		findViewById(R.id.tv_ins_rigester).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActivity(new Intent(LoginActivity.this,
								RegisterActivity.class));
						finish();
					}
				});
		findViewById(R.id.tv_forget_pass).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActivity(new Intent(LoginActivity.this,
								ResetPassActivity.class));
						finish();
					}
				});
	}

	@Override
	public void initData() {

	}

}
