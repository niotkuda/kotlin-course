package org.niotkuda.kotlincourse.lesson25

const val text = "dec"

fun fun1() {
    println(text)
}

fun main() {
    val fun2 = fun () { println(text) }

    val fun3: () -> Unit = { println(text) }

    val fun4 = { println(text) }

    fun1()
    fun2()
    fun3()
    fun4()
}