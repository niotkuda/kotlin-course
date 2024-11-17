package org.niotkuda.kotlincourse.lesson21

interface Validator<T> {
    fun isValid(element: T): Boolean
}