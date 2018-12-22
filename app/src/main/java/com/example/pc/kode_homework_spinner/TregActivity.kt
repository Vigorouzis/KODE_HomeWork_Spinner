package com.example.pc.kode_homework_spinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_treg.*

class TregActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treg)

        GO.setOnClickListener{

            var x1=x1.text.toString().toDouble()
            var y1=y1.text.toString().toDouble()
            var x2=x2.text.toString().toDouble()
            var y2=y2.text.toString().toDouble()
            var x3=x3.text.toString().toDouble()
            var y3=y3.text.toString().toDouble()

            val treg=Triangle(x1,y1,x2,y2,x3,y3)

            square.text=treg.s().toString()
            per.text=treg.p().toString()
        }
    }
}
