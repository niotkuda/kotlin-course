package org.niotkuda.kotlincourse.lesson22.ExtensionsHW22

fun <KEY> Map<KEY, Int>.funD(num: Int): Map<String, KEY?>? {
    return this.toMap() as Map<String, KEY?>?
}