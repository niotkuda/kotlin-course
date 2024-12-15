//package org.niotkuda.kotlincourse.lesson12
//
//
//
//fun main() {
//    //задача1
//    val numb = 5
//
//
////    Напиши валидную сигнатура метода
//
////    Напишите сигнатуру функции,
////    которая не принимает аргументов и не возвращает значения.
//
//    fun task1() {
//    }
//
////    Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
//
//    fun task2(a: Int, b: Int): Int {
//        return a + b
//    }
//
////    Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
//
//    fun task3(str: String) {
//    }
//
////    Напишите сигнатуру функции,
////    которая принимает список целых чисел и возвращает среднее значение типа Double.
//
//    fun task4(number: List<Int>): Double {
//return Double.MAX_VALUE
//    }
//
//
////    Напишите сигнатуру функции,
//// которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
//
//    fun task5(nullableStr: String?): Int? {
//        return nullableStr?.length
//    }
//
////    Напишите сигнатуру функции,
////    которая не принимает аргументов и возвращает nullable вещественное число.
//
//    fun task6(): Int? { //ФЛОТ ИЛИ ДАБЛ
//        return null
//    }
//
////    Напишите сигнатуру функции,
//// которая принимает nullable список целых чисел и не возвращает значения.
//
//    fun task7(nullable: List<Int?>) {
//
//    }
//
////    Напишите сигнатуру функции,
////    которая принимает целое число и возвращает nullable строку.
//
//    fun task8(number8: Int): String? {
//        return ""
//    }
//
//// !!!!   Напишите сигнатуру функции,
////    которая не принимает аргументов и возвращает список nullable строк.
//
//    fun task9(): List<String?> {
//        return listOf()
//    }
//
////    Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.
//
//    fun task10(nullableStr2: String?, nullableNumber: Int?): Boolean {
//return false
//    }
//}
////    Напиши рабочий код для следующих задач:
////    Задача 1:
////    Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
////
//fun multiplyByTwo(numb: Int) :Int{
//    return numb * 2
//}
//
//fun multiplyByTwo2(numb: Int) = numb * 2
//
////    Задача 2:
////    Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
//
//    fun isEven(numb: Int) :Boolean {
//      return numb % 2 == 0
//    }
//
//fun isEven2(numb: Int) = numb % 2 == 0
//
//
//// Задача 3:
////    Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
////    Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
//
////    fun printNumbersUntil(n: Int) {
////        for (i in n)
////            if (n < 1) return
////    }
//
//fun printNumbersUntil1(n: Int) {
//    if (n < 1) return
//    for (i in 1..n)
//        println(i)
//}
//
////    Задача 4:
////    Создайте функцию findFirstNegative, которая принимает список целых чисел
////    и возвращает первое отрицательное число в списке.
////    Если отрицательных чисел нет, функция должна вернуть null.
//
//    fun findFirstNegative(task4: List<Int>): Int? {
//for (i in task4){
//    if (1 < 0) return task4
//}
//        return null
//    }
//
//
////    Задача 5:
////    Напишите функцию processList, которая принимает список строк.
////    Функция должна проходить по списку и выводить каждую строку.
////    Если встречается null значение, функция должна прекратить выполнение
////    с помощью return без возврата значения.
//
//    fun processList(task5: List<String?>) {
//for (i in task5){
//    if (i == null) return
//}
//    }
//
//
////Сделай рефакторинг функции, через определение вспомогательных приватных функций.
////Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.
//
//
//fun drawRectangle(width: Int, height: Int) {
//    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
//    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")
//
//    // Верхняя граница
//    var topLine = "+"
//    for (i in 1 until width - 1) {
//        topLine += "-"
//    }
//    topLine += "+\n"
//    println(topLine)
//
//    // Боковые границы
//    for (i in 1 until height - 1) {
//        var middleLine = "|"
//        for (j in 1 until width - 1){
//            middleLine += " "
//        }
//        middleLine += "|\n"
//        println(middleLine)
//    }
//    // Нижняя граница
//    var bottomLine = "+"
//    for (i in 1 until width - 1) {
//        bottomLine += "-"
//    }
//    bottomLine += "+\n"
//    println(bottomLine)
//}