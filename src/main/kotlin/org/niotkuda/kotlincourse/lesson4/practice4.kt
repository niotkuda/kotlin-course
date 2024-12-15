package org.niotkuda.kotlincourse.lesson4

//                             ТИПЫ ДАННЫХ
//урок с 01:10:00

val myInt: Int = 5
val muFloat: Float = 64.5643F
val myLong: Long = 1_53_53986_42L //обычно хранится текущее время в секундах
val myShort: Short =  32000 //используется для экономии места
val myByte: Byte = 120
val myDouble: Double = 5.99 //

//ex: проверить max min значения
//val myInt: Int = Int.MAX_VALUE

val isKotlin: Boolean = true //индикатор вкл/выкл. Булево значение применяется для проверки if

val letter: Char = 'r'

val text: String = " "


//                            КОЛЛЕКЦИИ.СПИСКИ

val numbers: Array<Int> = arrayOf(1, 2, 3)
val strings: List<String> = listOf("one", "two", "three")
val doubles: Set<Double> = setOf(23.4, 24.3)

// MutableList - изменяемый список

val keysToValues: Map<String, String> = mapOf(
"Ключ 1" to "Значение1",
"Ключ 2" to "Значение 2"
)

val anything: Any = false //может быть любой тип. Тип будет известен в момент рантайм

fun printMess(messege: String): Unit{
}    // Unit тип говорит о том что типа нет.
// Если функция ничего не возвращает, то считается что она возвращает тип Unit

// Nothing тип означает, что функция не может быть исполнена.
// в момент исполнения этой функции будет выкинуто исключение и исполнение прервётся.

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

// практика 01:31