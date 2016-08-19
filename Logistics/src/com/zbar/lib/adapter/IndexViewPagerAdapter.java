package com.zbar.lib.adapter;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.zbar.lib.R;
import com.zbar.lib.bean.IndexFlash;

/**
 * @author zsj
 * @date 2016年6月20日下午8:09:28
 * @function
 */

public class IndexViewPagerAdapter extends FragmentPagerAdapter {

	private List<IndexFlash> mData = new ArrayList<IndexFlash>();
	int size = 0;

	public IndexViewPagerAdapter(FragmentManager fm, List<IndexFlash> data) {
		super(fm);
		mData.addAll(data);
		size = mData.size();
	}

	@Override
	public Fragment getItem(int position) {
		// ViewPagerFragment f = null;
		// if (position == 0) {
		// f = new ViewPagerFragment(mData.get(size - 1));
		// } else if (position == size + 1) {
		// f = new ViewPagerFragment(mData.get(0));
		// } else {
		// f = new ViewPagerFragment(mData.get(position % size));
		// }

		return new ViewPagerFragment(mData.get(position));
	}

	@Override
	public int getCount() {
		return size;
	}

	class ViewPagerFragment extends Fragment {
		IndexFlash flash = null;

		public ViewPagerFragment(IndexFlash flash) {
			Bundle bundle = new Bundle();
			bundle.putSerializable("flash", flash);
			setArguments(bundle);
		}

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			Bundle bundle = getArguments();
			flash = (IndexFlash) bundle.get("flash");
		}

		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View parent = inflater.inflate(R.layout.viewpager_index_item, null);
			ImageView iv = (ImageView) parent.findViewById(R.id.iv_pager_item);
			iv.setImageResource(flash.pIv);
			return parent;
		}
	}

}
