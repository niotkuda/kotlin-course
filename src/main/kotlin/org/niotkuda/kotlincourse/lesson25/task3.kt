package org.niotkuda.kotlincourse.lesson25

fun longStrings(list: List<String>, num: Int): List<String> {
    require(list.isNotEmpty()) { "list is empty" }
    return list.filter { it.length >= num }
}

fun main() {
    val longStrings1 = fun (list: List<String>, num: Int): List<String> {
        require(list.isNotEmpty()) { "list is empty" }
        return list.filter { it.length >= num }
    }

    val longStrings2: (list: List<String>, num: Int) -> List<String> = {list, num ->
        require(list.isNotEmpty()) { "list is empty" }
        list.filter { it.length >= num }
    }

    val longStrings3 = { list: List<String>, num: Int ->
        require(list.isNotEmpty()) { "list is empty" }
        list.filter { it.length >= num }
    }

    val list = listOf("a", "bb", "ccc")
    val emptyList = listOf<String>()

    println(longStrings(list, 2))
    println(longStrings1(list, 2))
    println(longStrings2(list, 2))
    println(longStrings3(list, 2))
}