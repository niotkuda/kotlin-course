package org.niotkuda.kotlincourse.lesson24.homework24

fun main() {
    try {
        val nullableVar = null
        nullableVar as String

        val arrayIndexOut = listOf(1, 2, 3, 4, 5)
        arrayIndexOut[6]

        val classCastExcept = "строка"
        classCastExcept as Int

        val numFormat = listOf(1, 2, "1,2")
        for (i in numFormat.indices) {
            val i = numFormat[i]
            if (i is String) {
                println(i.toInt())
            } else if (i is Int) {
                println(10 + i)
            }
        }

        val list = listOf(1, 2, 3, 4, 5)
        val newList = list.subList(4, 2)

        val illegalStateExc = 0
        check(illegalStateExc == 1)


    } catch (e: Throwable) {
        when (e) {
            is NullPointerException -> println("Это NullPointerException")
            is ArrayIndexOutOfBoundsException -> println("Это ArrayIndexOutOfBoundsException")
            is ClassCastException -> println("Это ClassCastException")
            is NumberFormatException -> println("Это NumberFormatException")
            is IllegalArgumentException -> println("Это IllegalArgumentException")
            is IllegalStateException -> println("Это IllegalStateException")
            is OutOfMemoryError -> println("Это OutOfMemoryError")
            is StackOverflowError -> println("Это StackOverflowError")
            else -> println("Непонятное исключение")
        }
    }
}