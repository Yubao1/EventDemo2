package com.xe.eventdemo2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent

class B_Activity : AppCompatActivity() {
    companion object {
        var TAG: String = "B_Activity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_)
    }


    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d(TAG,"-----B_Activity--onTouchEvent--ACTION_DOWN")
            }
            MotionEvent.ACTION_MOVE -> {
                Log.d(TAG,"-----B_Activity--onTouchEvent--ACTION_MOVE")
            }
            MotionEvent.ACTION_UP -> {
                Log.d(TAG,"-----B_Activity--onTouchEvent--ACTION_UP")
            }
        }
        return super.onTouchEvent(event)
    }
}
