package com.app.UTSmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nilaitugas = findViewById<EditText>(R.id.nilaiTugas)
        val nilaiuts = findViewById<EditText>(R.id.nilaUTS)
        val nilaiuas = findViewById<EditText>(R.id.nilaiUAS)
        val btnsubmit = findViewById<Button>(R.id.btn_submit)

        btnsubmit.setOnClickListener {
                //get value from  editte
            val tugas = nilaitugas.text.toString()
            val uts = nilaiuts.text.toString()
            val uas = nilaiuas.text.toString()
            val share_data_intent = Intent(this@MainActivity, DetailsAct::class.java)
            share_data_intent.putExtra("Tugas", tugas)
            share_data_intent.putExtra("UTS", uts)
            share_data_intent.putExtra("UAS", uas)
            startActivities(arrayOf(share_data_intent))
            finish()
        }
    }
}