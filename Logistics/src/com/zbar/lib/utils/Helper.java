package com.zbar.lib.utils;

import com.zbar.lib.common.BaseApplication;


/**
 * @author zsj
 * @date 2016年7月5日下午10:40:29
 * @function
 */

public class Helper {

	public static int px2dp(float pxValue) {
		float des = BaseApplication.getInstance().getResources()
				.getDisplayMetrics().density;
		return (int) (pxValue / des + 0.5f);
	}

	public static int dp2px(float dpValue) {
		float des = BaseApplication.getInstance().getResources()
				.getDisplayMetrics().density;
		return (int) (dpValue * des + 0.5f);
	}

	public static int sp2px(float spValue) {
		float des = BaseApplication.getInstance().getResources()
				.getDisplayMetrics().density;
		return (int) (spValue * des + 0.5f);
	}

	public static int px2sp(float pxValue) {
		float des = BaseApplication.getInstance().getResources()
				.getDisplayMetrics().density;
		return (int) (pxValue / des + 0.5f);
	}
}
