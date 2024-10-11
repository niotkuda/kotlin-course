package org.niotkuda.kotlincourse.lesson10

import com.sun.source.tree.LambdaExpressionTree

fun main() {
//Работа с Множествами Set 00:45:00


//Задание 1: Создание Пустого Множества
//Создайте пустое неизменяемое множество целых чисел.

    val emptySet: Set<Int>

//Задание 2: Создание и Инициализация Множества
//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).

    val setNumbers: Set<Int> = setOf(1, 2, 3)

//Задание 3: Создание Изменяемого Множества
//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").

    val setNumbers2 : MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")


//Задание 4: Добавление Элементов в Множество
//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").

    val setNumbers3 = mutableSetOf("Kotlin", "Java", "Scala")
    setNumbers3.add("Swift")
    setNumbers3.add("Go")


//Задание 5: Удаление Элементов из Множества
//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).

    val setInt : MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
    setInt.remove(2)
    //удаление элемента равного 2, а не по индексу

//    val setNumbers4 = setOf(1, 2, 3, 4, 5)
//    setNumbers4.remove(2)


//Задание 6: Перебор Множества в Цикле
//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.

    val setInt6 : MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
for (int in setInt) {
    println(int)
}

//Задание 7: Проверка Наличия Элемента в Множестве 00:46:00
//Создай функцию, которая принимает множество строк (set) и строку и проверяет,
// есть ли в множестве указанная строка.
// Нужно вернуть булево значение true если строка есть.
// Реши задачу через цикл.

fun cont(set: Set<String>, string: String) : Boolean {
   for (word in set) {
       if(word==string) return true
   }
    return false
}


//Задание 8: Объединение Двух Множеств
//Создайте два множества строк и объедините их в одно новое множество,
// содержащее все уникальные элементы обоих множеств.
// Реши задачу с помощью циклов.

val setString1 : Set<String> = setOf("cat", "dog", "parrot")
 val setString2 : Set<String> = setOf("dog", "squirrel", "parrot")
    val setString3 = mutableSetOf<String>()
    for(word in setString1) {
        setString3.add(word)
    }
for (word in setString2) {
    setString3.add(word)
}
//Задание 9: Нахождение Пересечения Множеств
//Создайте два множества целых чисел и найдите их пересечение (общие элементы).
// Реши задачу через вложенные циклы.

val setInt1 = setOf(1, 2, 3, 4, 5)
    val setInt2 = setOf(3, 4, 5, 6, 7)
    val comInt = mutableSetOf<Int>()
    for (e in setInt1){
        for (i in setInt2){
            if (i == e) comInt.add(i) //если
        }
    }


//Задание 10: Нахождение Разности Множеств 00:52
//Создайте два множества строк и найдите разность первого множества относительно второго
// (элементы, присутствующие в первом множестве, но отсутствующие во втором).
// Реши задачу через вложенные циклы и переменные флаги.

    val manyString : Set<String> = setOf("1, 2, 3, 4, 5, 6", "3843")
    val manyString2 : Set<String> = setOf("1, 9, 5, 6", "ckfs")
    val manyString3 = mutableSetOf<String>()
    for (i in manyString) {
        var boolean: Boolean = false
        for (letter in setString2) {
            if (letter == i) boolean = true

        }
        if (boolean == false) {
            setString3.add(i)
        }
    }

//Задание 11: Конвертация Множества в Список
//Создайте множество строк и конвертируйте его в список с использованием цикла.

    val setInteger = setOf("a", "b", "c", "d", "e")
    val list = mutableListOf<String>()
for (letter in setInteger) {
    list.add(letter)
}

}