package com.qian;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

public class View1 extends TextView{

	private String tag = "View1";
	public View1(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}
	public View1(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	public View1(Context context) {
		super(context);
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		Log.i(tag , "onTouchEvent");
		//return true;
		return super.onTouchEvent(event);
	}
	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		Log.i(tag , "dispatchTouchEvent");
		return super.dispatchTouchEvent(ev);
	}
}
