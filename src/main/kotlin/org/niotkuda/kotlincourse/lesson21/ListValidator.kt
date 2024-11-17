package org.niotkuda.kotlincourse.lesson21

class ListValidator<T: Number> : Validator<List<T?>> {
    override fun isValid(element: List<T?>): Boolean {
        return element.all { it != null && it.toDouble() != 0.0 }
    }
}