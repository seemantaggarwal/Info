package com.example.info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hdcw.*
import kotlinx.android.synthetic.main.activity_main.*

class hdcw : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hdcw)
        btn.setOnClickListener()
        {
            val intent = Intent(this, LDTM::class.java)
            startActivity(intent)
        }
    }
}
