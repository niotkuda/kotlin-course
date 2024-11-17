package org.niotkuda.kotlincourse.lesson21

// ДЖЕНЕРИКИ

class BoxAny(private val item: Any) {
    fun getItem(): Any {
        return item
    }
}

fun main() {
    val appleBoxAny = BoxAny("Apple")
    val intBoxAny = BoxAny(42)

    println("В коробке: ${appleBoxAny.getItem()}") // В коробке: Apple
    println("В коробке: ${intBoxAny.getItem()}")   // В коробке: 42


    class Box<T>(val item: T) {
        fun getItem(): T {
            return item
        }
    }

    fun <T> printItem(item: T) {
        println("Элемент: $item")
    }
    printItem("Hello")    // Элемент: Hello
    printItem(123)         // Элемент: 123
    printItem(3.14)        // Элемент: 3.14
    fun <T : Number> sum(a: T, b: T): Double {
        return a.toDouble() + b.toDouble()
    }


    fun main() {
        println(sum(5, 10))        // 15.0
        println(sum(3.5, 2.5))     // 6.0
    }

// ПРАКТИКА
    class Container<T>(val item: T ){
    }

    class PairBox<A, B>(val first: A, val second: B){}

    class LimitedContainer<A: Number>(val item: A?)

    interface Storage<T>{
        fun set (item: T)
        fun get(): T
    }
    interface Transformer<A, B> {
        fun  transform(item: A): B

    }


}
