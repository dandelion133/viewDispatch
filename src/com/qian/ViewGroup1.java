package com.qian;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class ViewGroup1  extends LinearLayout{

	private String tag = "ViewGroup1";


	@SuppressLint("NewApi") 
	public ViewGroup1(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}


	public ViewGroup1(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	
	public ViewGroup1(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean onTouchEvent(MotionEvent event) {
		Log.i(tag, "onTouchEvent");
		return super.onTouchEvent(event);
	}
	
	
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		Log.i(tag, "onInterceptTouchEvent");
		//return true;
		return super.onInterceptTouchEvent(ev);
	}
	
	
	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		Log.i(tag, "dispatchTouchEvent");
		return super.dispatchTouchEvent(ev);
	}
  
}
