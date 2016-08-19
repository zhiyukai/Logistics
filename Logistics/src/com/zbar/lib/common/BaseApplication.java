package com.zbar.lib.common;


import android.app.Application;

/**
 * @author zsj
 * @date 2016年6月26日下午3:28:47
 * @function
 */

public class BaseApplication extends Application {

	private static BaseApplication mApp;

	@Override
	public void onCreate() {
		super.onCreate();
		mApp = this;
	}

	public static BaseApplication getInstance() {
		return mApp;
	}
	
}
