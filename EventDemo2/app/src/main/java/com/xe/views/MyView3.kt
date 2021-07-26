package com.xe.views

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import com.xe.eventdemo2.B_Activity
import com.xe.eventdemo2.C_Activity

/**
 * Created by 86188 on 2021/7/23.
 */
class MyView3: View {

    constructor(context: Context) : super(context) {

    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {

    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d(C_Activity.TAG,"-----MyView3--onTouchEvent--ACTION_DOWN")
                return true
            }
            MotionEvent.ACTION_MOVE -> {
                Log.d(C_Activity.TAG,"-----MyView3--onTouchEvent--ACTION_MOVE")
                return true
            }
            MotionEvent.ACTION_UP -> {
                Log.d(C_Activity.TAG,"-----MyView3--onTouchEvent--ACTION_UP")
            }
        }
        return super.onTouchEvent(event)
    }
}