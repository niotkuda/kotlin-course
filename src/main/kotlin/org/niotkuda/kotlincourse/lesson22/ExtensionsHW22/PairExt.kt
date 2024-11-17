package org.niotkuda.kotlincourse.lesson22.ExtensionsHW22

fun <A,B> Pair<A?,B?>.revert() : Pair<B?,A?> {
    return second to first
}