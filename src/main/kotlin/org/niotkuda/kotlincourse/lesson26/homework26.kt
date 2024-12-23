package org.niotkuda.kotlincourse.lesson26

// Напишите функцию, которая принимает другую функцию без аргументов и возвращаемого значения.
fun f1(g: () -> Unit) {}

// Создайте функцию, принимающую функцию с одним аргументом типа Int и возвращающую String.
fun f2(g: (Int) -> String) {}

// Реализуйте функцию, принимающую функцию расширения типа Int, принимающую String и возвращающую Boolean.
fun f3(g: Int.(String) -> Boolean) {}

// Напишите функцию, которая принимает функцию с двумя аргументами типа Double и возвращает Boolean.
fun f4(g: (Double, Double) -> Unit): Boolean {
    return true
}

// Напишите функцию, которая принимает функцию с одним аргументом-дженериком T и возвращает List<T>.
fun <T> f5(g: (T) -> List<T>) {}

// Создайте функцию, принимающую функцию с аргументом типа String и возвращающую другую функцию, принимающую Int и возвращающую Boolean.
fun f6(g: (String) -> (Int) -> Boolean) {}

// Напишите функцию, которая принимает список чисел, множество строк, функцию с аргументами типа List<Int> и Set<String> и возвращающую Map<String, Int>.
fun f7(list: List<Int>, map: Set<String>, g: (List<Int>, Set<String>) -> Map<String, Int>) {}

// Напишите функцию, возвращающую строку, принимающую число и функцию, принимающую число и возвращающую строку
fun f8(num: Int, g: (Int) -> String) {}

// Напишите функцию, принимающую функцию, которая возвращает функцию без аргументов и возвращаемого значения.
fun f9(g: () -> () -> Unit) {}

fun main() {}