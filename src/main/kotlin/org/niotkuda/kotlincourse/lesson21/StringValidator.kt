package org.niotkuda.kotlincourse.lesson21

class StringValidator : Validator<String?> {
    override fun isValid(element: String?): Boolean {
        return !element.isNullOrBlank()
    }

}