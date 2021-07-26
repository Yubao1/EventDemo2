package com.xe.eventdemo2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.xe.views.MyView3

class C_Activity : AppCompatActivity() {
    companion object {
        var TAG: String = "C_Activity";
    }
    var mMyView3: MyView3? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c_)
        mMyView3 = findViewById(R.id.my_view3);
        mMyView3!!.isEnabled = true
        mMyView3!!.isClickable = false
        mMyView3!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d(TAG,"--C_Activity *** onClick--")
            }
        })
    }
}
