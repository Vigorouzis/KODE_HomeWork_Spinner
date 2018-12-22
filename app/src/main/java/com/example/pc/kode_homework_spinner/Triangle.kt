package com.example.pc.kode_homework_spinner

import kotlin.math.sqrt

class Triangle(var x1: Double, var y1: Double, var x2: Double, var y2: Double, var x3: Double, var y3: Double) {

    var a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))
    var b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3))
    var c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3))
    var p = (a + b + c) / 2
    fun s() = sqrt(((p * (p - a) * (p - b) * (p - c))))
    fun p() = a + b + c
}