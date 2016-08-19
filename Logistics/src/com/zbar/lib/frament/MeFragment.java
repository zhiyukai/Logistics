package com.zbar.lib.frament;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.zbar.lib.R;
import com.zbar.lib.common.BaseFragment;

/**
 * @author zsj
 * @date 2016年6月20日下午7:05:40
 * @function
 */

public class MeFragment extends BaseFragment {

	private View mParentView;

	private ImageView mUserIconIV;
	private TextView mTelNumTV;
	private TextView mCreditProportionTV;
	private ProgressBar mCreditValuePB;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		mParentView = inflater.inflate(R.layout.fragment_me, container, false);
		initView();
		initListeners();
		initData();
		return mParentView;
	}

	@Override
	public void onClick(View v) {
		if (v == null)
			return;
		switch (v.getId()) {
		case R.id.iv_user_icon:

			break;
		case R.id.tv_addr_book:

			break;
		case R.id.tv_kudi_dashi:

			break;
		case R.id.tv_quyu_jingli:

			break;
		case R.id.tv_kuaidi_chuan:

			break;
		case R.id.tv_complaints:

			break;
		case R.id.tv_set:

			break;

		default:
			break;
		}
	}

	@Override
	public void initView() {
		mUserIconIV = (ImageView) mParentView.findViewById(R.id.iv_user_icon);
		mTelNumTV = (TextView) mParentView.findViewById(R.id.tv_user_telnum);
		mCreditProportionTV = (TextView) mParentView
				.findViewById(R.id.tv_user_credit_proportion);
		mCreditValuePB = (ProgressBar) mParentView
				.findViewById(R.id.pb_user_credit_value);

	}

	@Override
	public void initListeners() {
		mParentView.findViewById(R.id.tv_addr_book).setOnClickListener(this);
		mParentView.findViewById(R.id.tv_kudi_dashi).setOnClickListener(this);
		mParentView.findViewById(R.id.tv_quyu_jingli).setOnClickListener(this);
		mParentView.findViewById(R.id.tv_kuaidi_chuan).setOnClickListener(this);
		mParentView.findViewById(R.id.tv_complaints).setOnClickListener(this);
		mParentView.findViewById(R.id.tv_set).setOnClickListener(this);
	}

	@Override
	public void initData() {

	}

}
