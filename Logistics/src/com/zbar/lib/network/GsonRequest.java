package com.zbar.lib.network;

import java.io.UnsupportedEncodingException;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonRequest;
import com.google.gson.Gson;
import com.zbar.lib.utils.CmConstant;

/**
 * @author zsj
 * @date 2016年6月28日下午7:36:46
 * @function volley的网络请求
 */

public class GsonRequest<T> extends JsonRequest<T> {
	private Gson mGson;
	private Class<T> mClass;
	private Listener<T> mListener;

	public GsonRequest(String url, String requestBody, Class<T> clazz,
			Listener<T> listener, ErrorListener errorListener) {
		this(Method.POST, url, requestBody, clazz, listener, errorListener);
	}

	public GsonRequest(int method, String url, String requestBody,
			Class<T> clazz, Listener<T> listener, ErrorListener errorListener) {
		super(method, url, requestBody, listener, errorListener);
		mGson = new Gson();
		mClass = clazz;
		mListener = listener;

		setRetryPolicy(new DefaultRetryPolicy(CmConstant.MY_SOCKET_TIMEOUT_MS,
				1, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
	}

	@Override
	protected Response<T> parseNetworkResponse(NetworkResponse response) {
		try {
			String json = new String(response.data,
					HttpHeaderParser.parseCharset(response.headers));

			return Response.success(mGson.fromJson(json, mClass),
					HttpHeaderParser.parseCacheHeaders(response));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return Response.error(new ParseError(e));
		}

	}

}
