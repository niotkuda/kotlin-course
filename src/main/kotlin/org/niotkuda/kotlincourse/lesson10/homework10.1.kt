package org.niotkuda.kotlincourse.lesson10
fun main() {
//Работа со списками List

 //   var list: = Any

//Задание 1: Создание Пустого Списка
//Создайте пустой неизменяемый список целых чисел.

//    val list3 = listOf<Int>() {
//        println()
//    }

    fun emptyList() {
        val emptyList = listOf<Int>()
    }



//Задание 2: Создание и Инициализация Списка
//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").

//    val lists4 = listOf("Hello", "World", "Kotlin")
//      for (i in lists4) {
//          println(i)
//      }

    fun listOfStrings() {
        val lists4 = listOf("Hello", "World", "Kotlin")
    }


//Задание 3: Создание Изменяемого Списка
//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.

//    fun listOfInts() {
//    val listOfInts = mutableListOf<Int>()
//
//        for (i in 0..4) listofInts.add(i + 1)
//
//        println(listOfInts)
//}


//    val mutableList = mutableListOf(1..5)
//    println()

//Задание 4: Добавление Элементов в Список
//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).

//fun listOfIntsExpanded(List: MutableList<Int>) {
//
//    list.add(6)
//    list.add(7)
//    list.add(8)
//
//}

//Задание 5: Удаление Элементов из Списка
//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").

fun removeFromList(list: MutableList<String>) {
    list.remove("World")
}


//    val mutableList4 = mutableListOf<String> ("Hello", "World", "Kotlin")
//    mutableList4.add("World")


//Задание 6: Перебор Списка в Цикле
//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.

//    fun loop() {
//        val list6 = listOf(1,2,3,4,5,6)
//        for (value in list) {
//            println(value)
//        }

//        for (i in list6) {
//            println(i)
        }
//    }



//Задание 7: Получение Элементов Списка по Индексу 00:40:48
//Создайте список строк и получите из него второй элемент, используя его индекс.
fun getString() {
    val listOfStrings = listOf<String>("list", "list2", "list3")
    println(listOfStrings[2])

}


//Задание 8: Перезапись Элементов Списка по Индексу 00:40:00
//Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).

//fun changeElement() {
//    val list = mutableListOf((1, 2, 3, 4, 5, 6)
//    list.add(2, 99)
//    println(list)
//}



//    val mutableList6 = mutableListOf(1, 2, 3, 4, 5, 6)
//    println(readOnlyList[2]) //???

//Задание 9: Объединение Двух Списков
//Создайте два списка строк и объедините их в один новый список,
// содержащий элементы обоих списков.
// Реши задачу с помощью циклов.

fun unite() {
    val list1 = listOf("Hello", "Java")
    val list2 = listOf("World", "Kotlin")
    val newList = mutableListOf<String>()
    for (value in list1) {
        newList.add(value)
    }
    for (value in list2) {
        newList.add(value)
    }
    println(newList)
}


//Задание 10: Нахождение Минимального/Максимального Элемента  00:43:00
//Создайте список целых чисел
// и найдите в нем минимальный и максимальный элементы используя цикл.

fun minAndMax() {


//val list = listOf((1, 2, 3, 4, 5, 6, 7, 8)
//var min = list[0]
//var max = list[0]
//
//for (value in list) {
//    if (value < min) {
//        min = value
//    }
//    if (value > max) {
//        max = value
//    }
//}
//}


//Задание 11: Фильтрация Списка
//Имея список целых чисел, создайте новый список,
//содержащий только четные числа из исходного списка используя цикл.

    fun evensOnly(list: List<Int>) {

        val listOfEvens = mutableListOf<Int>()

        for (value in list) {
            (value % 2 == 0)
            listOfEvens.add(value)
        }
        println(listOfEvens)
    }

}