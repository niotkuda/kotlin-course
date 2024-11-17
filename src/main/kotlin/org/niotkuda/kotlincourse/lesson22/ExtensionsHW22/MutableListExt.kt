package org.niotkuda.kotlincourse.lesson22.ExtensionsHW22

fun <T> MutableList<T>.funChangeValue(arg1: T?, arg2: Int) : T? {
    if (arg2 in 0 until this.size && arg1 != null) {
        this[arg2] = arg1
        return arg1
    }
    return null
}