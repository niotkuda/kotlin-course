package org.niotkuda.kotlincourse.lesson26

//fun main() {
//
//
////    fun processWebData(
//        query: String,
//        fetcher: (String) -> List<Map<String, Any>>,
//        transformer: (List<Map<String, Any>>) -> List<User>,
//        displayer: (List<User>) -> Unit
//    ) {
//        val rawData = fetcher(query)
//        val transformedData = transformer(rawData)
//        displayer(transformedData)
//    }
//}

//    fun main() {
//
//        val fetcher: (String) -> List<Map<String, Any>> = {
//            // orm.select(it).map { listOf() }
//            listOf(mapOf("Andrey" to "5"))
//        }
//
//        val transformer: (List<Map<String, Any>>) -> List<User> = {
//            it.map { map -> User(map.keys.first()) }
//        }
//
//        val displayer: (List<User>) -> Unit = {
//            println(it)
//        }
//
//        processWebData("sql query", fetcher, transformer, displayer)
//
//    }

//

fun main() {

    val name:(Int) -> String = {
        it.toString() + "5"
    }
    smth28(name)

    val name2:(Int) -> String = {
        "${it + 5}"
    }
    smth28(name2)
}

fun smth26(arg1: () -> Unit ) {

}

fun smth27(){
    val smth = fun(){}
    val smth2:() -> Unit
}

fun smth28(arg2: (Int) -> String) {
    println(arg2(56))
}

fun <T> smth29(arg4: List<T>, arg3: (List<T>) -> T): T {
    return arg3(arg4)
}