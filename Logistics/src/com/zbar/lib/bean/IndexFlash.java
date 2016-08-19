package com.zbar.lib.bean;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * @author zsj
 * @date 2016年6月28日下午11:38:20
 * @function
 */

public class IndexFlash implements Serializable {
	private static final long serialVersionUID = -4969053959390720161L;
	@SerializedName("iv")
	public int pIv;
}
