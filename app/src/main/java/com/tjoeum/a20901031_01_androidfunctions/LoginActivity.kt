package com.tjoeum.a20901031_01_androidfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    //이름과 회원번호를 입력하고 로그인 버튼을 누르면
    //Ex 10번 구민성 회원님 환영합니다.라는 Toast를 띄우자

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        loginBtn.setOnClickListener {
            var loginName = loginName.text.toString()
            var userNumber = uesrNumber.text.toString()
            Toast.makeText(this,"이름 : ${loginName} 회원번호 : ${userNumber}",Toast.LENGTH_SHORT).show()
        }

    }
}
