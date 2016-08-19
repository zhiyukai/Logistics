package com.zbar.lib.customview;

import com.zbar.lib.utils.CusInterface.RightOnClickListener;
import com.zbar.lib.utils.Helper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * @author zsj
 * @date 2016年6月20日下午4:45:14
 * @function
 */

public class CusSearchEditText extends EditText {

	private RightOnClickListener mRightClick;

	public CusSearchEditText(Context context) {
		super(context);
	}

	public CusSearchEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public CusSearchEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public void setRightOnClikListner(RightOnClickListener rightClick) {
		mRightClick = rightClick;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_UP) {
			if (event.getX() > (getWidth() - Helper.dp2px(34))) {
				if (mRightClick != null) {
					mRightClick.rightClick();
				}
			}
		}
		return super.onTouchEvent(event);
	}

}
