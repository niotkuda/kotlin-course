package org.niotkuda.kotlincourse.lesson12
fun main() {


                                      //ФУНКЦИИ
// проверка дз до 00:40:00
// Функции это один из основных строительных блоков программ, который позволяет
// объединять повторяющийся код в единые логические блоки.
// ФУНКЦИЯ = действие/action. Она что-то делает.
// АРГУМЕНТ-это переменная, мы придумываем сами название и тип.
// в () объявляем какие типы переменная принимает и названия для этих переменных.


    replayString(listOf<"dfhdh", "dghjty">)
    var name: String = "fd"
    name = "fekve"
val result=sum(6.8, 5.7, true)
    println(result)


}
fun nameFun(параметры): ТипВозвращаемогоЗначения {
    // имя отражает что функция генерирует, делает, возвращает,
    // параметры аргумент может отсутствовать, может быть несколько, в аргументах у нас название и тип

//{} обрамляют тело функции,
    return значение   // return прекращает всю дальнейшую работу функции.
// Если после return что-то есть оно выполняться не будет
    // если в return передано значение оно будет возвращено из функции
}


//  название функции, аргументов нет(), возвращаемого значения нет
fun sayHello(){
    println("Hello, world!")
}





// функция с аргументом
fun greetUser(name: String) {
    println("Hello, $name!")
}


// функция с возвращаемым значением
fun sum(a: Int, b: Int) : Int {
    return a+b
}


// если функция ничего не возвращает, то return не может быть
fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a+b}")
}

// Unit класс, который означает ничто. У него нет полей.
// Класс заглушка. null значение заглушка



//
fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun multiply1(a: Int, b: Int) = a * b //тип подставит автоматически


// и приватные(доступен внутри файла) методы
//
private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}


//публичные(доступен внутри модуля)
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
            return  // return используется, чтобы остановить выполнение функции
            // либо использовать break и тогда распечатается значение в принтлн
        }
        println(number)
    }
    println("Value not found")
}
// ПРАКТИКА
// заготовки функций. Сигнатуры.

//функция которая ничего не принимает и не передаёт

fun doSomething() = Unit

//
fun doSomething1(): Unit {

}


//функция, которая не принимает аргументов и возвращает строку

fun getUserName(): String {
    return ""
}


//функция, которая принимает строковый аргумент и не возвращает значения

fun printGrit(grit:String){

}

// функция принимает 2 аргумента типа Double и возвращает Double

fun calcArea(area:Double, area1: Double): Double {
    return 9.0
}

// функция принимает 2 целых числа и возвращает це

fun find(ch1: Int, ch2: Int): Int {
    return 6
}

// функция принимает nullable строку и возвращает булево значение

fun isNull(n:String?): Boolean{
    return false
}

// функция принимает список строк, принимает количество, возвращает Double?
fun calcDiscount(disc:List<String>, arg: Int?):Double?{
    return null
}


// напиши функцию сум которая принимает 2 Double числа и булево значение

fun sum(first:Double, second: Double, flag: Boolean):Double {
    if (flag) {
        first + second
    } else {
        val raz = first - second
        return raz
    } // код вернёт сумму если флаг будет тру и разницу если флаг будет фолс
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