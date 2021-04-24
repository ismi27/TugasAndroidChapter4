package com.Tugas4sc6.tugasandroidchapter4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.profile.*

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)
        add.setOnClickListener {
            val intent: Intent = Intent(applicationContext, Edit::class.java)
            startActivity(intent)
        }
        review.setOnClickListener {
            val intent: Intent = Intent(applicationContext, Review::class.java)
            startActivity(intent)
        }

    }

}