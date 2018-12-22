package com.example.pc.kode_homework_spinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rect.*

class RectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rect)

        GO.setOnClickListener{

            var x1=x1.text.toString().toInt()
            var y1=y1.text.toString().toInt()
            var x2=x2.text.toString().toInt()
            var y2=y2.text.toString().toInt()


            val rect=Rectangle(x1,y1,x2,y2)

            square.text=rect.s().toString()
            per.text=rect.p().toString()
        }

    }
}
