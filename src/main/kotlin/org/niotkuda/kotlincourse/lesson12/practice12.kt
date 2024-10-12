package org.niotkuda.kotlincourse.lesson12
fun main() {

    replayString(listOf<"dfhdh", "dghjty">)
    var name: String = "fd"
    name = "fekve"
val result=sum(6.8, 5.7, true)
    println(result)

// проверка дз до 00:40:00

// ФУНКЦИЯ = действие

}
fun имяФункции(параметры): ТипВозвращаемогоЗначения {

//тело функции
    return значение
}

fun sayHello(){
    println("Hello, world!")
}

fun greetUser(name: String){
    println("Hello, $name!")
}

fun sum(a: Int, b: Int) : Int {
    return a+b
}

fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a+b}")
    return "fun"
}


fun multiply(a: Int, b: Int): Int {
    return a * b
}

// публичные(доступен внутри модуля) и приватные(доступен внутри файла) методы
//
private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}

fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

fun max(a: Int, b: Int) :Int {
   return if (a > b) a else b
}

fun findValue(numbers: List<Int>, target: Int) {
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return
        }
        println(number)
    }
    println("Value not found")
}

// заготовки функций сигнатуры??
//функция которая ничего не принимает и не передаёт
fun doSmth(){
}

fun doSmth() = Unit

fun getUserName(): String {
    return ""
}

fun printGrit(grit:String){

}

fun calcArea(area:Double, area1: Double): Double {
    return 9.0
}


fun find(ch1: Int, ch2: Int): Int {
    return 6
}

fun isNull(n:String?): Boolean{
    return false
}

fun calcDiscount(disc:List<String>, arg: Int?):Double?{
    return null
}


// напиши функцию сум которая принимает 2 дабл числа и булево значение

fun sum(first:Double, second: Double, flag: Boolean):Double {
    if (flag) {
        first + second
    } else {
        val raz = first - second
        return raz
    }
    //либо оптимальнее
    fun sum1(first: Double, second: Double, flag: Double): Double {
        return if (flag) {
            first + second
        } else {
            first - second
        }
    }


    fun getMax(f: Int, s: Int) = if (f < s) s else f


    fun printPositiveNumbers(a: List<Int>) {
        val i
        if (i: in a){
            if (i > 0) {
                println(i)
            } else break

        }
    }
    println("конец")


    fun replayString(strings: MutableList<String>, str: String) {
        for (i in strings) {
            if (strings[i] == str) {
                strings[i] = str.uppercase()
                return
            }

        }
    }
    println("No string")

}


private fun checkSize(xy: Int, result: String){

}



fun printMap(xSize: Int, ySize: Int) {
    if (xSize == 0) throw IllegalArgumentException("xSize не должно быть равным нулю")
    if (ySize == 0) throw IllegalArgumentException("ySize не должно быть равным нулю")
    val formatterSize = " $xSize".length
    val xRange = if (xSize > 0) {
        0..xSize
    } else {
        0 downTo xSize
    }
    val yRange = if (ySize > 0) {
        0..ySize
    } else {
        0 downTo ySize
    }
    print(" ".repeat(formatterSize))
    for (i in xRange) {
        print("%${formatterSize}s".format(i))
    }
    println()
    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in yRange) {
            val m = i * j
            val result = when {
                m % 2 == 0 -> if (m % 3 == 0) "." else "*"
                m % 5 == 0 -> if (i < 0) "-" else "+"
                else -> "?"
            }
            print("%${formatterSize}s".format(result))
        }
        println()
    }
}