package com.zbar.lib.frament;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridView;

import com.zbar.lib.R;
import com.zbar.lib.activity.CaptureActivity;
import com.zbar.lib.activity.LoginActivity;
import com.zbar.lib.activity.SearchResultActivity;
import com.zbar.lib.adapter.IndexGridAdapter;
import com.zbar.lib.adapter.IndexViewPagerAdapter;
import com.zbar.lib.bean.IndexFlash;
import com.zbar.lib.common.BaseFragment;
import com.zbar.lib.customview.CusGridView;
import com.zbar.lib.customview.CusSearchEditText;
import com.zbar.lib.utils.CmConstant;
import com.zbar.lib.utils.CusInterface.RightOnClickListener;

/**
 * @author zsj
 * @date 2016年6月20日下午7:05:40
 * @function
 */

public class IndexFragment extends BaseFragment {

	private View mParentView;
	private ViewPager mIndexVP;
	private CusGridView mIndexGV;
	private List<IndexFlash> mData;
	private CusSearchEditText mSearchContentET;

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		Log.e("---", "Fragment onViewCreated");
		super.onViewCreated(view, savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mData = new ArrayList<IndexFlash>();
		IndexFlash fl1 = new IndexFlash();
		fl1.pIv = R.drawable.a;
		IndexFlash fl2 = new IndexFlash();
		fl2.pIv = R.drawable.b;
		mData.add(fl1);
		mData.add(fl2);

		mParentView = inflater.inflate(R.layout.fragment_index, container,
				false);
		initView();
		initListeners();
		initData();
		return mParentView;
	}

	@Override
	public void onClick(View v) {

	}

	@Override
	public void initView() {
		mSearchContentET = (CusSearchEditText) mParentView
				.findViewById(R.id.et_content);
		mIndexVP = (ViewPager) mParentView.findViewById(R.id.viewPager);
		mIndexGV = (CusGridView) mParentView.findViewById(R.id.gv_index);
		// 设置背景不出现黄色
		mIndexGV.setSelector(new ColorDrawable(Color.TRANSPARENT));

		mIndexVP.addOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageScrolled(int i, float f, int j) {

			}

			@Override
			public void onPageSelected(int position) {
				// int pageIndex = position;
				// if (position == 0) {
				// pageIndex = mData.size();
				// } else if (position == mData.size() + 1) {
				// pageIndex = 1;
				// }
				// if (pageIndex != position) {
				// mIndexVP.setCurrentItem(pageIndex, true);
				// return;
				// }
			}

			@Override
			public void onPageScrollStateChanged(int i) {

			}

		});
	}

	@Override
	public void initListeners() {
		mSearchContentET.setRightOnClikListner(new RightOnClickListener() {

			@Override
			public void rightClick() {
				Intent intent = new Intent(getActivity(),
						SearchResultActivity.class);
				intent.putExtra(CmConstant.ORDER_NUM,
						mSearchContentET.getText() + "");
				startActivity(intent);
			}
		});
		mParentView.findViewById(R.id.tv_right).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActivity(new Intent(getActivity(),
								LoginActivity.class));
					}
				});
		mParentView.findViewById(R.id.iv_scan).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActivity(new Intent().setClass(getActivity(),
								CaptureActivity.class));
					}
				});
	}

	@Override
	public void initData() {
		// query(new GsonRequest<InfoBean>(CmConstant.TEST, null,
		// InfoBean.class,
		// new Response.Listener<InfoBean>() {
		//
		// @Override
		// public void onResponse(InfoBean info) {
		// Log.e("----", info.toString());
		// List<TestInfo> list = info.pInfoList;
		// int size = list.size();
		// for (int i = 0; i < size; i++) {
		// TestInfo ti = list.get(i);
		// System.out.println(ti.toString());
		// }
		// }
		//
		// }, new Response.ErrorListener() {
		//
		// @Override
		// public void onErrorResponse(VolleyError error) {
		// Log.e("---", error.toString());
		// }
		// }));
		mIndexVP.setAdapter(new IndexViewPagerAdapter(getActivity()
				.getSupportFragmentManager(), mData));
		mIndexGV.setAdapter(new IndexGridAdapter(getActivity()));
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.e("---", "Fragment onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onAttach(Activity activity) {
		Log.e("---", "Fragment onAttach_Activity");
		super.onAttach(activity);
	}

	@Override
	public void onAttach(Context context) {
		Log.e("---", "Fragment onAttach_Context");
		super.onAttach(context);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.e("---", "Fragment onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onDestroy() {
		Log.e("---", "Fragment onDestroy");
		super.onDestroy();
	}

	@Override
	public void onDestroyView() {
		Log.e("---", "Fragment onDestroyView");
		super.onDestroyView();
	}

	@Override
	public void onDetach() {
		Log.e("---", "Fragment onDetach");
		super.onDetach();
	}

	@Override
	public void onPause() {
		Log.e("---", "Fragment onPause");
		super.onPause();
	}

	@Override
	public void onResume() {
		Log.e("---", "Fragment onResume");
		super.onResume();
	}

	@Override
	public void onStart() {
		Log.e("---", "Fragment onStart");
		super.onStart();
	}

	@Override
	public void onStop() {
		Log.e("---", "Fragment onStop");
		super.onStop();
	}
}
