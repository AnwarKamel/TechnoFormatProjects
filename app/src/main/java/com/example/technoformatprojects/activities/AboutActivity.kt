package com.example.technoformatprojects.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.technoformatprojects.R
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)


       var test: CharSequence = "manel"

        btn_show.setText("manel"  )

        btn_show.setOnClickListener {

        }

    }

    fun show(view: View) {

    }


}