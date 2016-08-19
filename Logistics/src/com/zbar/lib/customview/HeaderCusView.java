package com.zbar.lib.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.zbar.lib.R;
import com.zbar.lib.common.BaseApplication;
import com.zbar.lib.utils.CusInterface;
import com.zbar.lib.utils.Helper;

/**
 * @author zsj
 * @date 2016年7月5日下午10:19:28
 * @function
 */

public class HeaderCusView extends LinearLayout {

	private int mDefaultSzie = Helper.dp2px(20);
	private int mDefaultColor = BaseApplication.getInstance().getResources()
			.getColor(R.color.black);

	private int mDefaultRightVis = INVISIBLE;

	private CusInterface.BackListener mBackListener;

	private String mMidContent;
	private int mMidSize;
	private int mMidColor;

	private String mRightContent;
	private int mRightSize;
	private int mRightColor;
	private int mRightVisibile;

	public HeaderCusView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);

		TypedArray array = context.obtainStyledAttributes(R.styleable.Header);
		mMidContent = array.getString(R.styleable.Header_middle_text);
		mMidSize = array.getInt(R.styleable.Header_middle_text_size,
				mDefaultSzie);
		mMidColor = array.getColor(R.styleable.Header_middle_text_color,
				mDefaultColor);

		mRightContent = array.getString(R.styleable.Header_right_text);
		mRightSize = array.getInt(R.styleable.Header_right_text_size,
				mDefaultSzie);
		mRightColor = array.getColor(R.styleable.Header_right_text_color,
				mDefaultColor);
		mRightVisibile = array.getInt(R.styleable.Header_right_visiable,
				mDefaultRightVis);
		View view = LayoutInflater.from(context).inflate(R.layout.include_head,
				this, true);
		// View view = View.inflate(context, R.layout.include_head, this);
		view.findViewById(R.id.iv_back).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						if (mBackListener != null) {
							mBackListener.back();
						}
					}
				});

		array.recycle();
	}

	public HeaderCusView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public HeaderCusView(Context context) {
		this(context, null, 0);
	}

	public void setBackListener(CusInterface.BackListener backListener) {
		mBackListener = backListener;
	}

}
