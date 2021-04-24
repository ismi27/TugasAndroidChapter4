package com.Tugas4sc6.tugasandroidchapter4

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_review.*

class Review : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_review)
        send.setOnClickListener(View.OnClickListener {
            Toast.makeText(
                applicationContext,
                "Applicant review & rating successfully sended", Toast.LENGTH_LONG
            ).show()

            val jml_bintang = rtb_Kualitas.numStars
            val peringkat = rtb_Kualitas.rating
            txt_TampilNilai.setText("Quality Applicant: " + peringkat + "/" + jml_bintang)
        })

        abort.setOnClickListener(View.OnClickListener {
            Toast.makeText(
                applicationContext,
                "Applicant review & rating successfully abort", Toast.LENGTH_LONG
            ).show()

            val jml_bintang = rtb_Kualitas.numStars
            val peringkat = rtb_Kualitas.rating
            txt_TampilNilai.setText("Quality Applicant: " + peringkat + "/" + jml_bintang)
        })
    }

    fun fungsiRBJK(view: View) {
        rd_yes.isChecked(true)
        rd_no.isChecked(true)
    }
}