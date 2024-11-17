package org.niotkuda.kotlincourse.lesson21

class OddValidator : Validator<Int> {
    override fun isValid(element: Int): Boolean {
        return element % 2 == 0
    }
}