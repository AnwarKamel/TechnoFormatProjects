package com.example.technoformatprojects.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.technoformatprojects.R
import com.example.technoformatprojects.activities.auth.LoginActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_go_to_login.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

    }
}