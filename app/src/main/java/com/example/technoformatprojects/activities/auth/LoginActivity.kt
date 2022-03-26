package com.example.technoformatprojects.activities.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.technoformatprojects.R
import com.example.technoformatprojects.activities.dashboard.ProfileActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtSignUp.setOnClickListener {
            startActivity(Intent(this, SigninActivity::class.java))
        }


        btn_login.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))

        }

    }
}