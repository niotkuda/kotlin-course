package org.niotkuda.kotlincourse.lesson18.shapes

class Square(private val side: Double) : Shape() {
    override fun area(): Double = side * side
}