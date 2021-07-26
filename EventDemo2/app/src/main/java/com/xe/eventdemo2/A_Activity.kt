package com.xe.eventdemo2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class A_Activity : AppCompatActivity() {
    companion object {
        var TAG: String = "A_Activity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_)
    }
}
