package com.tjoeum.a20901031_01_androidfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //intent
        var receivedId = intent.getStringExtra("id")
        var receivedName = intent.getStringExtra("name")
        var receivedNumber = intent.getStringExtra("userNumber")

        userNameTxt.text = receivedName
        userNumberTxt.text = "${receivedNumber}회원 (${receivedId})"
    }
}
