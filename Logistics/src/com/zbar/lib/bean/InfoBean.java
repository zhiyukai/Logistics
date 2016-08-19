package com.zbar.lib.bean;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.zbar.lib.model.TestInfo;

/**
 * @author zsj
 * @date 2016年6月28日下午9:14:43
 * @function
 */

public class InfoBean {
	@SerializedName("info_list")
	public List<TestInfo> pInfoList = new ArrayList<TestInfo>();

	// @Override
	// public String toString() {
	// return "InfoBean [pBody=" + pBody + "]";
	// }
}
