package org.niotkuda.kotlincourse.lesson20

abstract class TemperatureControllDevice : ProgrammableDevice(), TemperatureRegulatable, Openable {


    private var isOpen: Boolean = false




    override fun open() {
        isOpen = true
        println("открыто")
    }

    override fun close() {
        isOpen = false
        println("закрыто")
    }
}