package com.example.kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun signIn(view: View) {

        val email = emailInput.text.toString()
        val pas = passwordInput.text.toString()
        val dan_mak: Array<String> = arrayOf("makarov01V@yandex.ru", "Hello1")
        val mih_abr: Array<String> = arrayOf("bibo1@yandex.ru", "Hello2")
        val mar_ars: Array<String> = arrayOf("bibo2@yandex.ru", "Hello3")
            if (email == dan_mak[0] || email == mih_abr[0] || email == mar_ars[0])
            {
                if ((email == dan_mak[0])&&(pas == dan_mak[1])) {
                    val enterTo = Intent(this, Profile::class.java)
                    startActivity(enterTo)


                }
                if ((email == mih_abr[0])&&(pas == mih_abr[1])) {
                    val enterTo = Intent(this, MihAbr::class.java)
                    startActivity(enterTo)
                }
                if ((email == mar_ars[0])&&(pas == mar_ars[1])) {
                    val enterTo = Intent(this, MarArs::class.java)
                    startActivity(enterTo)
                }
        }

            else
        {
            val myToast = Toast.makeText(this, "Your password or email is incorrect!", Toast.LENGTH_SHORT)
            myToast.show()
        }


    }


}


