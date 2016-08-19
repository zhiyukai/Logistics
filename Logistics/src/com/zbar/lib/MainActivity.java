package com.zbar.lib;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.zbar.lib.frament.IndexFragment;
import com.zbar.lib.frament.MeFragment;
import com.zbar.lib.frament.SecondFragment;

public class MainActivity extends FragmentActivity implements OnClickListener {

	private Fragment mIndexFragment, mSecondFragment, mThirdFragment;
	private TextView mFirstTV;
	private TextView mSecondTV;
	private TextView mThirdTV;

	@Override
	protected void onDestroy() {
		Log.e("---", "Activity onDestroy");
		super.onDestroy();
	}

	@Override
	protected void onStart() {
		Log.e("---", "Activity onStart");
		super.onStart();
	}

	@Override
	protected void onRestart() {
		Log.e("---", "Activity onRestart");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.e("---", "Activity onResume");
		super.onResume();
	}

	@Override
	protected void onPause() {
		Log.e("---", "Activity onPause");
		super.onPause();
	}

	@Override
	protected void onStop() {
		Log.e("---", "Activity onStop");
		super.onStop();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.e("---", "Activity onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mFirstTV = (TextView) findViewById(R.id.tv_first);
		mSecondTV = (TextView) findViewById(R.id.tv_second);
		mThirdTV = (TextView) findViewById(R.id.tv_third);

		setTabSelect(0);

		mFirstTV.setOnClickListener(this);
		mSecondTV.setOnClickListener(this);
		mThirdTV.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (v == null)
			return;
		switch (v.getId()) {
		case R.id.tv_first:
			setTabSelect(0);
			break;
		case R.id.tv_second:
			setTabSelect(1);
			break;
		case R.id.tv_third:
			setTabSelect(2);
			break;
		default:
			break;
		}
	}

	private void setTabSelect(int index) {
		reset();
		FragmentManager manager = getSupportFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		hide(transaction);
		switch (index) {
		case 0:
			mIndexFragment = manager.findFragmentByTag("tag1");
			if (mIndexFragment == null) {
				mIndexFragment = new IndexFragment();
				transaction.add(R.id.fragment_main, mIndexFragment, "tag1");
			} else {
				transaction.show(mIndexFragment);
			}
			// Drawable drawable = getResources().getDrawable(
			// R.drawable.tab_home_sel);
			// drawable.setBounds(0, 0, drawable.getMinimumWidth(),
			// drawable.getMinimumHeight());
			// mFirstTV.setCompoundDrawables(null, drawable, null, null);

			Drawable top1 = getResources().getDrawable(R.drawable.tab_home_sel);
			mFirstTV.setCompoundDrawablesWithIntrinsicBounds(null, top1, null,
					null);
			mFirstTV.setTextColor(getResources().getColor(
					R.color.main_tab_color_1));
			break;
		case 1:
			mSecondFragment = manager.findFragmentByTag("tag2");
			if (mSecondFragment == null) {
				mSecondFragment = new SecondFragment();
				transaction.add(R.id.fragment_main, mSecondFragment, "tag2");
			} else {
				transaction.show(mSecondFragment);
			}
			break;
		case 2:
			mThirdFragment = manager.findFragmentByTag("tag3");
			if (mThirdFragment == null) {
				mThirdFragment = new MeFragment();
				transaction.add(R.id.fragment_main, mThirdFragment, "tag3");
			} else {
				transaction.show(mThirdFragment);
			}

			Drawable top2 = getResources().getDrawable(R.drawable.tab_user_sel);
			mThirdTV.setCompoundDrawablesWithIntrinsicBounds(null, top2, null,
					null);
			mThirdTV.setTextColor(getResources().getColor(
					R.color.main_tab_color_1));
			break;
		default:
			break;
		}
		transaction.commitAllowingStateLoss();
	}

	private void hide(FragmentTransaction tran) {
		if (mIndexFragment != null) {
			tran.hide(mIndexFragment);
		}
		if (mSecondFragment != null) {
			tran.hide(mSecondFragment);
		}
		if (mThirdFragment != null) {
			tran.hide(mThirdFragment);
		}
	}

	private void reset() {

		Drawable top1 = getResources().getDrawable(R.drawable.tab_home_nor);
		mFirstTV.setCompoundDrawablesWithIntrinsicBounds(null, top1, null, null);
		mFirstTV.setTextColor(getResources().getColor(R.color.main_tab_color_2));

		Drawable top2 = getResources().getDrawable(R.drawable.tab_user_nor);
		mThirdTV.setCompoundDrawablesWithIntrinsicBounds(null, top2, null, null);
		mThirdTV.setTextColor(getResources().getColor(R.color.main_tab_color_2));
	}
}
