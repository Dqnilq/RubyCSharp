package com.example.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.view.View
import androidx.annotation.RequiresPermission
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.locks.ReentrantReadWriteLock

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)

    }
    fun Back(view: View)
    {
        val backTo = Intent(this, MainActivity::class.java)
        startActivity(backTo)
    }
}
