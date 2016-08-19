package com.zbar.lib.network;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.zbar.lib.common.BaseApplication;

/**
 * @author zsj
 * @date 2016年6月28日下午8:19:02
 * @function volley网络请求的封装
 */

public final class NetworkProvider {

	private RequestQueue mRequestQueue;

	private NetworkProvider(Context ctx) {
		if (mRequestQueue == null) {
			mRequestQueue = Volley.newRequestQueue(ctx);
		}
	}

	public static class SingleFactory {
		private static NetworkProvider networkProvider = new NetworkProvider(
				BaseApplication.getInstance());

		public static NetworkProvider getInstance() {
			return networkProvider;
		}
	}

	public void addRequest(Object tag, Request<?> request) {
		if (tag != null) {
			request.setTag(tag);
		}
		mRequestQueue.add(request);
	}

	public void cancelAll(Object tag) {
		mRequestQueue.cancelAll(tag);
	}

}
