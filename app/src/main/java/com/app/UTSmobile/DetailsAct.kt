package com.app.UTSmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class DetailsAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        var intent = intent
        val tugas = intent.getStringExtra("Tugas")
        val uts = intent.getStringExtra("UTS")
        val uas = intent.getStringExtra("UAS")

        //Get Data
        val label_tugas = findViewById<TextView>(R.id.label_tugas)
        val label_uts = findViewById<TextView>(R.id.label_uts)
        val label_uas = findViewById<TextView>(R.id.label_uas)

        //
        label_tugas.text = tugas
        label_uts.text = uts
        label_uas.text = uas
    }
}

