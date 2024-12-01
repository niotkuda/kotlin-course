package org.niotkuda.kotlincourse.lesson25

fun avg(list: List<Int>): Double {
    require(list.isNotEmpty()) { "list is empty" }
    return list.average()
}

fun main() {
    val list1 = fun (list: List<Int>): Double {
        require(list.isNotEmpty()) { "list is empty" }
        return list.average()
    }

    val list2: (List<Int>) -> Double = {
        require(it.isNotEmpty()) { "list is empty" }
        it.average()
    }

    val list3 = { list: List<Int> ->
        require(list.isNotEmpty()) { "list is empty" }
        list.average()
    }

    val emptyList = listOf<Int>()
    val list = listOf(1, 2, 3)

    println(avg(list))
    println(list1(list))
    println(list2(list))
    println(list3(list))
}