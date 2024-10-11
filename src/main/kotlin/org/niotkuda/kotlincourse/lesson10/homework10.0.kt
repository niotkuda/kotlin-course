package org.niotkuda.kotlincourse.lesson10
fun main() {

//Работа с массивами Array

//Задание 1: Создание и Инициализация Массива
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.

    val array3: Array<Int> = arrayOf(1, 2, 3, 4, 5)


//Задание 2: Создание Пустого Массива
//Создайте пустой массив строк размером 10 элементов.

    val emptyArray0: = Array(10) { "" }
// val emptyArray0: Array<String> = Array(10) { "" }

//Задание 3: Заполнение Массива в Цикле
//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.

    // val doubles = doubleArrayOf(1.1, 2.2, 3.3, 4.4, 5.5) не верно 00:04:00 на эфире

    println(" ")
    println("--- Task - 3 ---")
    println(" ")
    val taskHome3Array: Array<Double> = Array(5) { 0.0 }
    for (i in taskHome3Array.indices) {
        taskHome3Array[i] = (i * 2).toDouble()
        println(taskHome3Array[i])
    }


//Задание 4: Изменение Элементов Массива
//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.

//val massive6 = Array (5) не верно
//    for (i in Array * 3)
//        println()

    println(" ")
    println("--- Task - 4 ---")
    println(" ")
    val taskHome4Array: Array<Int> = Array(5) { 0 }
    for (i in taskHome4Array.indices) {
        taskHome4Array[i] = (i * 3)
        println(taskHome4Array[i])
    }

//Задание 5: Работа с Nullable Элементами
//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.

//    val emptyNullableArray: Array<Int?> = arrayOfNulls<Int>(3) не верно

    val taskHome5Array: Array<String?> = arrayOf(null, "dgf", "vv,")
    println(taskHome5Array.toList())

//Задание 6: Копирование Массива
//Создайте массив целых чисел и скопируйте его в новый массив в цикле.

    val massive7: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val massive8 = Array<Int>(9) { 0 }
    for (i in massive7.indices) {
        massive8[i] = massive7[i]
    }
    println(massive8.toList())

//Задание 7: Разница Двух Массивов
//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.

    val firstMassive = arrayOf(43, 39, 439, 340, 1)
    val secondMassive = arrayOf(4, 8, 9, 3, 7)
    val thirdMassive = Array(9) { 0 }
    for (i in thirdMassive.indices) {
        thirdMassive[i] = firstMassive[i] - secondMassive[i]
    }
    println(thirdMassive.toList())

//Задание 8: Поиск Индекса Элемента
//Создайте массив целых чисел.
// Найдите индекс элемента со значением 5.
// Если значения 5 нет в массиве, возвращаем -1.
// Реши задачу через цикл while.

    val task8Array = arrayOf(1, 2, 3, 4, 5, 9, 6, 8, 8, 5, 7, 0)
    val count = 0 // count перебирает индексы
    var result = -1
    while (count < task8Array.size) {
        if (task8Array[count] == 5) { //если элемент из массива по индексу count = 5
            result = count
            break
        }
        count++
    }

    println(result)
//найдет только первую попавшуюся 5, подробнее переслушать 00:32:00

//Задание 9: Перебор Массива 00:33:20
//Создайте массив целых чисел.
// Используйте цикл для перебора массива и вывода каждого элемента в консоль.
// Напротив каждого элемента должно быть написано “чётное” или “нечётное”.

    val task9Array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9) //создаём массив
    for (i in task9Array) { // создаём цикл с логическим выражением
        if (i % 2 == 0 && i != 0) { // если i делится на 2 без остатка и остаток 0, то выведет четное
            println("$i - чётное")
        } else if (i == 0) {
            println("$i - Просто ноль ") // ошибка 0 чётное число, чекнуть
        } else println("$i - нечётное")

    }

println(task10Array(arrayOf("one", "two", "three"), "on"))
}

//Задание 10: Поиск Значения в Массиве по вхождению
//Создай функцию, которая принимает массив строк и строку для поиска.
// Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
// Верни найденный элемент из функции в виде строки.

fun task10Array(array: Array<String>, searchString: String) : String {
    for (i in array) {
        if (i.contains(searchString)) {
            return i
        }   //ошибка. Нужно выводить пустую строку. исправить
    }
    return searchString
}



