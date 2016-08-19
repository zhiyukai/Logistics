package com.zbar.lib.common;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.android.volley.Request;
import com.zbar.lib.network.NetworkProvider;

/**
 * @author zsj
 * @date 2016年6月26日下午3:25:49
 * @function
 */

public abstract class BaseActivity extends FragmentActivity {
	private NetworkProvider mNetProvider;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView();
		mNetProvider = NetworkProvider.SingleFactory.getInstance();
		initView();
		initListeners();
		initData();
	}

	@Override
	protected void onStop() {
		super.onStop();
		mNetProvider.cancelAll(this);
	}

	protected void query(Request<?> request) {
		mNetProvider.addRequest(this, request);
	}

	public abstract void setContentView();

	public abstract void initView();

	public abstract void initListeners();

	public abstract void initData();

}
