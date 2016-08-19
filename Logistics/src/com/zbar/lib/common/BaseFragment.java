package com.zbar.lib.common;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.android.volley.Request;
import com.zbar.lib.network.NetworkProvider;

/**
 * @author zsj
 * @date 2016年6月28日下午8:39:13
 * @function
 */

public abstract class BaseFragment extends Fragment implements View.OnClickListener{
	private NetworkProvider mNetProvider;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mNetProvider = NetworkProvider.SingleFactory.getInstance();
	}

//	@Override
//	public View onCreateView(LayoutInflater inflater, ViewGroup container,
//			Bundle savedInstanceState) {
//		initView();
//		initListeners();
//		initData();
//		return null;
//	}

	@Override
	public void onStop() {
		super.onStop();
		mNetProvider.cancelAll(this);
	}

	protected void query(Request<?> request) {
		mNetProvider.addRequest(this, request);
	}

	public abstract void initView();

	public abstract void initListeners();

	public abstract void initData();
}
