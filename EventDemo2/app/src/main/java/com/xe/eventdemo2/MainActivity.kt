package com.xe.eventdemo2

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Created by 86188 on 2021/7/20.
 */
class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(v: View?) {
        when(v?.id) {
           R.id.btn_a -> {
               var intent: Intent = Intent(this,A_Activity::class.java)
               startActivity(intent)
           }

            R.id.btn_b -> {
                var intent2: Intent = Intent(this,B_Activity::class.java)
                startActivity(intent2)
            }

            R.id.btn_c -> {
                var intent2: Intent = Intent(this,C_Activity::class.java)
                startActivity(intent2)
            }
        }
    }
}