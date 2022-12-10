package com.gustonecrush

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button

class WeatherCheckPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_check_page)

        val autoTextView = findViewById<AutoCompleteTextView>(R.id.autocomplete_city)
        val cities = resources.getStringArray(R.array.cities)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1 , cities)

        autoTextView.setAdapter(adapter)

        handleSubmit()

    }

    fun handleSubmit() {
        val btnSubmit = findViewById<Button>(R.id.btn_submit)

        btnSubmit.setOnClickListener{
            val intent = Intent(this, ResultPage::class.java)
            startActivity(intent)
        }
    }
}