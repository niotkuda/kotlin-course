package org.niotkuda.kotlincourse.lesson22.ExtensionsHW22

fun Long?.toFormattedString(): String {
    return this?.let { "Long value: $it" } ?: "Null Long"
}