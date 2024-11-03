package org.niotkuda.kotlincourse.lesson18.printer

fun main() {
    val laserPrinter = LaserPrinter()
    val inkjetPrinter = InkjetPrinter()

    val text = "The quick brown fox jumps over the lazy dog"
    laserPrinter.print(text)
    inkjetPrinter.print(text)
}