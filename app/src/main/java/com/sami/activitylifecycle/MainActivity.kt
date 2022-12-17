package com.sami.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scrollview_activity)
        println("oncreate called")
    }

    override fun onStart() {
        super.onStart()
        println("onstart called")
    }

    override fun onResume() {
        super.onResume()
        println("onResume called")
    }

    override fun onPause() {
        super.onPause()
        println("onpause called")
    }

    override fun onStop() {
        super.onStop()
        println("onstop called")
    }

    override fun onRestart() {
        super.onRestart()
        println("onrestart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("ondestroy called")
    }
}