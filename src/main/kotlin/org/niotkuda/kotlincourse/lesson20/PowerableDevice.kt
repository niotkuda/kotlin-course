package org.niotkuda.kotlincourse.lesson20


abstract class PowerableDevice: Powerable {
    protected var isTurnedOn = false

    override fun powerOn() {
        isTurnedOn = true
        println("on")
    }
    override fun powerOff() {
        isTurnedOn = false
        println("off")
    }
}