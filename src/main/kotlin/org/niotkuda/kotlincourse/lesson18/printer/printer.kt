package org.niotkuda.kotlincourse.lesson18.printer

abstract class Printer {
    abstract fun print(text: String)

    protected fun splitText(text: String): List<String> {
        return text.split(" ")
    }
}