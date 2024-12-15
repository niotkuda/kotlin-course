//package org.niotkuda.kotlincourse.lesson25
//fun main(){
//
//
//fun increment(a: Int): Int {
//
//    return a + 1
//
//}
//
//val increment = fun (a: Int): Int {
//
//    return a + 1
//
//}
//
//val increment: (Int) -> Int = { a ->
//
//    a + 1
//
//}
//
//val increment = { a: Int ->
//
//    a + 1
//
//}
//
//fun findIndex(text: String, word: String, ignoreCase: Boolean = false): Int {
//
//    return text.indexOf(word, 0, ignoreCase)
//
//}
//val findIndex = fun(text: String, word: String, ignoreCase: Boolean): Int {
//
//    return text.indexOf(word, 0, ignoreCase)
//
//}
//val findIndex: (String, String, Boolean) -> Int = { text, word, ignoreCase ->
//
//    text.indexOf(word, 0, ignoreCase)
//
//}
//
//
//val findIndex = { text: String, word: String, ignoreCase: Boolean ->
//
//    text.indexOf(word, 0, ignoreCase)
//
//}
//
//
//class OrderProcessor(val deliveryAddress: String) {
//
//
//
//    fun calculateDeliveryTime(productId: Int): String {
//
//        val deliveryTimeDays = when (productId) {
//
//            in 1..100 -> 3
//
//            else -> 5
//
//        }
//
//        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
//
//    }
//
//}
//
//
//val calculateDeliveryTime = fun OrderProcessor.(productId: Int): String {
//
//    val deliveryTimeDays = when (productId) {
//
//        in 1..100 -> 3
//
//        else -> 5
//
//    }
//
//    return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
//
//}
//
//
//
//val calculateDeliveryTime: OrderProcessor.(Int) -> String = {
//
//    val deliveryTimeDays = when (it) {
//
//        in 1..100 -> 3
//
//        else -> 5
//
//    }
//
//    "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
//
//}
//
//    val op = OrderProcessor("my address")
//
//    op.calculateDeliveryTime1(34)
//
//
//}