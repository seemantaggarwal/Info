package com.example.info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ldtm.*

class LDTM : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ldtm)
        btn.setOnClickListener {
            val intent = Intent(this, classification::class.java)
            startActivity(intent)
        }
    }
}
