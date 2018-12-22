package com.example.pc.kode_homework_spinner

class Rectangle(var x1: Int, var y1: Int, var x2: Int, var y2: Int) {

    fun s() = Math.abs(x1 - x2) * Math.abs(y1 - y2)
    fun p() = (Math.abs(x1 - x2) + Math.abs(y1 - y2)) * 2
}