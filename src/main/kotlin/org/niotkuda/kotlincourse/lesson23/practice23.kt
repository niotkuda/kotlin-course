//package org.niotkuda.kotlincourse.lesson23
//
//// Проверка и преобразование типов
////Проверка типов. Переменные хранят значения,
//// у этих значений есть какой-то тип/класс
////Есть возможность проверять к какому типу относится объект напр.
//// в тех случаях когда тип никак не обозначен
////Объект может быть обозначен интерфейсом,
////но при этом его можно создать из различных классов,
//// которые имплементируют интерфейс
////Или объект обозначен интерефейсом но его создавали
//
//fun main() {
//
//    // ПРОВЕРКА ТИПОВ
//
//val obj: Any = "Hello, World!"
//
//
//
//if (obj is String) {
//
//    println("Объект является строкой")
//
//}
//
//
//if (obj !is Int) {
//
//    println("Объект не является целым числом")
//
//}
//
//if (obj is String) {
//
//    // obj автоматически приведён к String
//
//    println(obj.toUpperCase()) // Метод toUpperCase() доступен, т.к. obj теперь String
//
//}
//
//    // ПРОВЕРКА ТИПОВ это возможность языка, которая позволяет
//    //изменить существующий тип объекта с одного на другой
//val num: Any = 123
//
//val str: String = num as String // безопасное преобразование типов
//
//val safeStr: String? = num as? String
//
//val nullableStr: String? = "Kotlin" // имеем объект кот.явл. налбл строкой
//
//val nonNullableStr: String = nullableStr as String //преобразовываем и становится не налбл
//
//
//
//
//    val mixedList: List<Any> = listOf("Kotlin", 42, 3.14, "Java", true)
//
//
//
//for (item in mixedList) {
//
//    when (item) {
//
//        is String -> println("$item - строка длиной ${item.length}")
//
//        is Int -> println("$item - целое число")
//
//
//        is Double -> println("$item - вещественное число")
//
//        else -> println("Неизвестный тип")
//
//    }
//
//}
//
//interface Drivable {
//
//    fun drive()
//
//}
//
//
//
//interface Flyable {
//
//    fun fly()
//
//}
//class FlyingCar : Drivable, Flyable {
//
//    override fun drive() {
//
//        println("Едет как автомобиль")
//
//    }
//
//    override fun fly() {
//
//        println("Летит как самолёт")
//
//    }
//
//}
//if (drivable is Flyable) {
//
//    println("Этот объект также может летать!")
//
//    drivable.fly()
//
//} else {
//
//    println("Этот объект не может летать.")
//
//}
//
//
//    val flyingCar = FlyingCar()
//
//
//
//    checkCapabilities(flyingCar)
//
//}
//
//
//fun main() {
//
//    val flyingCar = FlyingCar()
//
//
//
//    checkCapabilities(flyingCar)
//
//}