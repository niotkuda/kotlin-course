package org.niotkuda.kotlincourse.lesson12

import org.niotkuda.kotlincourse.lesson5.result

fun main() {
    //задача1
    val numb = 5


//    Напиши валидную сигнатура метода

//    Напишите сигнатуру функции,
//    которая не принимает аргументов и не возвращает значения.

    fun task1() {
    }

//    Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.

    fun task2(a: Int, b: Int): Int {
        return a + b
    }

//    Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.

    fun task3(str: String) {
    }

//    Напишите сигнатуру функции,
//    которая принимает список целых чисел и возвращает среднее значение типа Double.

    fun task4(number: List<Int>): Double {

    }


//    Напишите сигнатуру функции,
// которая принимает nullable строку и возвращает её длину в виде nullable целого числа.

    fun task5(nullableStr: String?): Int? {
        return null
    }

//    Напишите сигнатуру функции,
//    которая не принимает аргументов и возвращает nullable вещественное число.

    fun task6(): Int? {
        return null
    }

//    Напишите сигнатуру функции,
// которая принимает nullable список целых чисел и не возвращает значения.

    fun task7(nullable: Int?) {

    }

//    Напишите сигнатуру функции,
//    которая принимает целое число и возвращает nullable строку.

    fun task8(number8: Int): String? {
        return null
    }

// !!!!   Напишите сигнатуру функции,
//    которая не принимает аргументов и возвращает список nullable строк.

    fun task9(): String {
        return listOf(String?)
    }

//    Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.

    fun task10(nullableStr2: String?, nullableNumber: Int?): Boolean? {

    }
}
//    Напиши рабочий код для следующих задач:
//    Задача 1:
//    Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
//
fun multiplyByTwo(numb: Int) :Int{
    return numb * 2
}

//    Задача 2:
//    Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.

    fun isEven(numb: Int) :Boolean {
        return false
    }

//!!!!!!
//
// Задача 3:
//    Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
//    Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.

    fun printNumbersUntil(){
        for ()
    }

//    Задача 4:
//    Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
//    Если отрицательных чисел нет, функция должна вернуть null.

    fun findFirstNegative(){

    }

//    Задача 5:
//    Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
//    Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.

    fun processList(){

    }
