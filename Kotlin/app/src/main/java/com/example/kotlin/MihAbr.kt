package com.example.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MihAbr : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mih_abr)
    }
    fun Back(view: View)
    {
        val backTo = Intent(this, MainActivity::class.java)
        startActivity(backTo)
    }
}
