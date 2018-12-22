package com.example.pc.kode_homework_spinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_circle.*

class CircleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        GO.setOnClickListener {

            var r = radius.text.toString().toInt()


            val circle = Circle(r)

            square.text = circle.s().toString()
            per.text = circle.p().toString()
        }
    }
}
