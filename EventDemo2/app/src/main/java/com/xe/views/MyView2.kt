package com.xe.views

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import com.xe.eventdemo2.A_Activity
import com.xe.eventdemo2.B_Activity

/**
 * Created by 86188 on 2021/7/22.
 */
class MyView2 : View {

    constructor(context: Context) : super(context) {

    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {

    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d(B_Activity.TAG,"-----MyView2--onTouchEvent--ACTION_DOWN")
            }
            MotionEvent.ACTION_MOVE -> {
                Log.d(B_Activity.TAG,"-----MyView2--onTouchEvent--ACTION_MOVE")
            }
            MotionEvent.ACTION_UP -> {
                Log.d(B_Activity.TAG,"-----MyView2--onTouchEvent--ACTION_UP")
            }
        }
        return super.onTouchEvent(event)
    }
}