package com.example.pc.kode_homework_spinner

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.AdapterView
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val second = Intent(this, TregActivity::class.java)
        val third = Intent(this, RectActivity::class.java)
        val fourth = Intent(this, CircleActivity::class.java)

        val figure = arrayOf("", "Triangle", "Rectangle", "Circle")

        val adapter = ArrayAdapter(
            this, // Context
            android.R.layout.simple_spinner_item, // Layout
            figure // Array
        )
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)

        spinner.adapter = adapter;

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

                when (position) {
                    1 -> {

                        startActivity(second)
                    }
                    2 -> {

                        startActivity(third)
                    }
                    3 -> {

                        startActivity(fourth)
                    }
                }
            }


        }
    }
}


