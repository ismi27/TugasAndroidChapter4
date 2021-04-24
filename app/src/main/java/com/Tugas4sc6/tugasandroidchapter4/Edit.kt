package com.Tugas4sc6.tugasandroidchapter4

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_editprofile.*
import java.text.SimpleDateFormat
import java.time.DayOfWeek
import java.time.Year
import java.util.*


class Edit : AppCompatActivity() {

    var cal = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_editprofile)

        val dateSetListener = object : DatePickerDialog.OnDateSetListener {
            override fun onDateSet(
                view: DatePicker?,
                year: Int,
                monthOfYear: Int,
                dayOfMonth: Int
            ) {
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateDateInView()
            }
        }
        tanggal.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                DatePickerDialog(
                    this@Edit, dateSetListener, cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_WEEK)
                ).show()
            }

        })


        pass.setOnClickListener(View.OnClickListener {
            val obj = AlertDialog.Builder(this)
            obj.setTitle("Announcement")
            obj.setMessage("Are you sure to pass the applicant?")
            obj.setPositiveButton(android.R.string.yes) { dialog, which ->
                Toast.makeText(
                    applicationContext,
                    "Applicant data successfully passed", Toast.LENGTH_SHORT
                ).show()
            }
            obj.setNegativeButton(android.R.string.no) { dialog, which ->
                Toast.makeText(
                    applicationContext,
                    "Cancel", Toast.LENGTH_SHORT
                ).show()
            }
            obj.show()
        })

        failed.setOnClickListener(View.OnClickListener {
            val obj = AlertDialog.Builder(this)
            obj.setTitle("Announcement")
            obj.setMessage("Are you sure to abort the applicant?")
            obj.setPositiveButton(android.R.string.yes) { dialog, which ->
                Toast.makeText(
                    applicationContext,
                    "Applicant data successfully aborted", Toast.LENGTH_SHORT
                ).show()
            }
            obj.setNegativeButton(android.R.string.no) { dialog, which ->
                Toast.makeText(
                    applicationContext,
                    "Cancel", Toast.LENGTH_SHORT
                ).show()
            }

            obj.show()
        })

    }

    fun updateDateInView() {
        val myFormat = "MM/dd/yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.US)
        tanggal.setText(sdf.format(cal.time))
    }

    fun fungsiRBJK(view: View) {
        rd_Pria.isChecked(true)
        rd_Wanita.isChecked(true)
    }

}

fun RadioButton.isChecked(b: Boolean) {

}
