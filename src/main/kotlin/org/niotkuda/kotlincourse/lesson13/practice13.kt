package org.niotkuda.kotlincourse.lesson13

fun main(){

    val list = listOf(8, 56, 23, 87, 12, 18, 11)
    val filtered1 = filter(list)
    println(filtered1)

    val filtered2 = list.filter { it in 7..17 }
    println(filtered2)

}

val nullableList = listOf(1, null, 2, null, 3)

val nonNullList = nullableList.filterNotNull()

println(nonNullList)
val firstPositive = numbers.firstOrNull { it > 0 }
println(firstPositive)
val elementOrElse = numbers.getOrElse(10) { -1 }
println(elementOrElse)

fun filter(collection: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in collection) {
        if (i in 7..17) result.add(i)
    }
    return result
}