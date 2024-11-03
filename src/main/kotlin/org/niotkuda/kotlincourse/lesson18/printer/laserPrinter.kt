package org.niotkuda.kotlincourse.lesson18.printer

class LaserPrinter : Printer() {
    override fun print(text: String) {
        splitText(text).forEach { word ->
            println(word)
        }
    }
}