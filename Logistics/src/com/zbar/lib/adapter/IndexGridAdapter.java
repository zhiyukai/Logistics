package com.zbar.lib.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.zbar.lib.R;

/**
 * @author zsj
 * @date 2016年7月4日下午8:51:47
 * @function
 */

public class IndexGridAdapter extends BaseAdapter {

	private Context mCtx;
	private int[] mData = { R.drawable.home_btn_logistics,
			R.drawable.home_btn_express, R.drawable.home_btn_servicewindow,
			R.drawable.home_btn_storage };

	public IndexGridAdapter(Context ctx) {
		mCtx = ctx;

	}

	@Override
	public int getCount() {
		return 4;
	}

	@Override
	public Object getItem(int position) {
		return mData[position];
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		int drawid = mData[position];
		HolderView holder = null;
		if (convertView == null) {
			holder = new HolderView();
			convertView = LayoutInflater.from(mCtx).inflate(
					R.layout.index_grid_item, null);
			holder.iv = (ImageView) convertView.findViewById(R.id.iv_grid_item);
			convertView.setTag(holder);
		} else {
			holder = (HolderView) convertView.getTag();
		}
		holder.init(drawid);

		return convertView;
	}

	public static class HolderView {
		ImageView iv;

		private void init(int drawid) {
			iv.setImageResource(drawid);
		}
	}
}
