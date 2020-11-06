package com.example.convertmilestokm

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonConvMilesToKm : Button = findViewById(R.id.buttonConvMilesToKm)
        val buttonConvKmToMiles : Button = findViewById(R.id.buttonConvKmToMiles)
        buttonConvMilesToKm.setOnClickListener {
            val Km: TextView = findViewById(R.id.editTextKm)
            val Miles: TextView = findViewById(R.id.editTextMiles)
            val fmiles: Float = Miles.text.toString().toFloat()
            Km.text = (fmiles*1.609).toString()
        }
        buttonConvKmToMiles.setOnClickListener {
            val Km: TextView = findViewById(R.id.editTextKm)
            val Miles: TextView = findViewById(R.id.editTextMiles)
            val fkm: Float = Miles.text.toString().toFloat()
            Miles.text = (fkm*0.621).toString()
        }
    }
}
