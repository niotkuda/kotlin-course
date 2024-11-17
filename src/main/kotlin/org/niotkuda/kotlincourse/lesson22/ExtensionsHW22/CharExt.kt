package org.niotkuda.kotlincourse.lesson22.ExtensionsHW22

fun Char?.processChar(arg1: Int, arg2: Int, arg3: Boolean) {
    if (this != null) {
        println("Char: $this, Sum: ${arg1 + arg2}, Bool: $arg3")
    } else {
        println("Null Char, Sum: ${arg1 + arg2}, Bool: $arg3")
    }
}