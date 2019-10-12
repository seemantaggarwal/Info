package com.example.info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageViewCoupons.setOnClickListener()
        {
            val intent = Intent(this, LDTM::class.java)
            startActivity(intent)
        }
        imageViewHistory.setOnClickListener()
        {
            val intent = Intent(this, classification::class.java)
            startActivity(intent)
        }
        imageViewInfo.setOnClickListener {
            val intent = Intent(this, WDWD::class.java)
            startActivity(intent)
        }
        imageViewProfile.setOnClickListener {
            val intent = Intent(this, hdcw::class.java)
            startActivity(intent)
        }
    }
}
