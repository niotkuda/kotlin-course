package org.niotkuda.kotlincourse.lesson18.printer

class InkjetPrinter : Printer() {
    override fun print(text: String) {
        splitText(text).forEach { word ->
            println(word)
        }
    }
}