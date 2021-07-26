package com.xe.views

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.LinearLayout
import com.xe.eventdemo2.A_Activity

/**
 * Created by 86188 on 2021/7/20.
 */
class MyLinearLayout: LinearLayout {
    constructor(context: Context): super(context) {

    }

    constructor(context: Context,attrs: AttributeSet): super(context,attrs) {

    }

    constructor(context: Context,attrs: AttributeSet,defStyleAttr: Int): super(context,attrs,defStyleAttr) {

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d(A_Activity.TAG,"-----MyLinearLayout--onTouchEvent--ACTION_DOWN")
            }
            MotionEvent.ACTION_MOVE -> {
                Log.d(A_Activity.TAG,"-----MyLinearLayout--onTouchEvent--ACTION_MOVE")
            }
            MotionEvent.ACTION_UP -> {
                Log.d(A_Activity.TAG,"-----MyLinearLayout--onTouchEvent--ACTION_UP")
            }
        }
        return true
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        if (ev?.action == MotionEvent.ACTION_DOWN) {
            Log.d(A_Activity.TAG,"-----MyLinearLayout----onInterceptTouchEvent")
            return true
        } else if (ev?.action == MotionEvent.ACTION_MOVE) {
            Log.d(A_Activity.TAG,"-----MyLinearLayout----onInterceptTouchEvent")
        }
        return false
    }
}