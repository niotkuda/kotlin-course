package org.niotkuda.kotlincourse.lesson10

fun main(){

    //МАССИВЫ. Массивы в Kotlin это упорядоченные коллекции фиксированного размера.
    //Содержащие элементы одного типа (учитываем что тип может быть Any) т.е массив может одержать что угодно
//
    val numbers: Array<Int> = arrayOf(1, 2, 3) //class/type for massive; <> типизиция для объектов массива

    val doubles = doubleArrayOf(1.1, 2.2) //

        //создание пустого массива(заполненный элементами, совсем пустой мб только налэбл. Массив нужен чтобы иметь обратную совместимость с джавой.

    val emptyArray = Array(5) { "" }// в {}лямбда выражение прости хспд
    val emptyNullableArray: Array<Int?> = arrayOfNulls<Int>(5)


//массивы всегда изменяемые. Списки неизм.

    //СПИСКИ

    val readOnlyList: List<String> = listOf("a", "b", "c")


    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")//ИЗМЕНЯЕМЫЙ СПИСОК


    //множества-все эл-ты множ. будут уникальны
    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5)

    //методы

mutableList.add("ui")

    val set = setOf("K", "o", "t", "l", "i", "n")

    for (letter in set) {
        println("| $letter |")
    }

    val list = listOf(32, 53,1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }
//while перебирает
    var index = list.lastIndex
    while (index >= 0) {
        println("`${list[index--]}`")
    }


    val array = Array(100) { 0 }
val arrayDouble = doubleArrayOf(1.0, 2.0, 3.0)
    val array1 = Array(10) { 0 }
    array1[0]=10
    for (i in array1.indices){
        array1[i]
    }

val list1 = listOf<Int>() //пустой список

    val list2 = listOf("fbb","vl","xclcl")
    for (i in list2) {
        println(i)
    }
    println()

    val mutableList1 = mutableListOf<Float> ()
    mutableList1.add(45F)
    mutableList1.add(38F)
    mutableList1.remove(45F)
    mutableList1.removeAt(0)

    println(mutableList1)




    }




