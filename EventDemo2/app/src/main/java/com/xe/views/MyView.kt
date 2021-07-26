package com.xe.views

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import com.xe.eventdemo2.A_Activity

/**
 * Created by 86188 on 2021/7/20.
 */
class MyView : View {

    constructor(context: Context) : super(context) {

    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {

    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d(A_Activity.TAG, "-----MyView--onTouchEvent")
        return false
    }
}