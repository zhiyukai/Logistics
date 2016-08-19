package com.zbar.lib.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author zsj
 * @date 2016年6月28日下午8:52:43
 * @function 后台返回数据的实体
 */

public class TestInfo {

	@SerializedName("id")
	public int pId;
	@SerializedName("name")
	public String pName;
	@SerializedName("phone")
	public String pPhone;

	@Override
	public String toString() {
		return "TestInfo [pId=" + pId + ", pName=" + pName + ", pPhone="
				+ pPhone + "]";
	}

}
