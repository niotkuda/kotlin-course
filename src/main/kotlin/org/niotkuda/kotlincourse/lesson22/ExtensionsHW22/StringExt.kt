package org.niotkuda.kotlincourse.lesson22.ExtensionsHW22

fun String.encrypt(base: Int): String {
    return map { (it + base).toChar() }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return map { (it - base).toChar() }.joinToString("")
}