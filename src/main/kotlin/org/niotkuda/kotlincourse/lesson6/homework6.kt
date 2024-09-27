package org.niotkuda.kotlincourse.lesson6

////fun main(){
//    val season: IntRange = 3..5
//    println("Spring")
//    val winter Int = 12
//    println("Winter")
//    val intRange2: IntRange = 1..2
//    println("Spring")
//    val intRange3: IntRange = 6..8
//    println("Summer")
//    val intRange4: IntRange = 2..4
//    println("Autumn")
//
//    fun checkSeasons(intRange: IntRange)
//
//}          //Задание 1: "Определение Сезона"
////Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.



}

// 1 определение сезона

// 2 расчет возраста питомца

// 3 определение вида транспорта

// 4 расчет бонусных баллов

// 5 определение типа документа

// 6 конвертация температуры

// 7 подбор одежды по погоде

val temperature = 10

if (temperature < 0) {
    println("Наденьте куртку и шапку")
}
if 0..15 -> "ветровка"


// 8 выбор фильма по возрасту

// от 0 до 14 детский  от 14 до 18 подростковый от 18 до 100 взрослый

fun categoryFilm (age: Int) : String {
    return when (age)
    in 0..14 -> "детский"
    in 15..17 -> "подростковый"
    in  18..100 -> "взрослый"
} else -> "проблема"




