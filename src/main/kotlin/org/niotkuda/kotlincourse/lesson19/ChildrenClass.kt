//package org.niotkuda.kotlincourse.lesson19
//
//abstract class BaseClass(
//
//
//    protected val protectedVal: String,
//    val publicVal: String
//) {
//    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
//            "Доработай ChildrenClass таким образом, чтобы это получилось"
//        set(value) {
//            if (verifyPublicField(value)) {
//                field = value
//            }
//        }
//    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
//    private var privateField = "добавь сеттер чтобы изменить меня из main()"
//    fun setPrivateField(value: String) {
//        privateField = value
//    }
//
//    fun getAll(): String {
//        return mapOf(
//            "privateVal" to privateVal,
//            "protectedVal" to protectedVal,
//            "publicVal" to publicVal,
//            "publicField" to publicField,
//            "protectedField" to protectedField,
//            "privateField" to privateField,
//        ).map { "${it.key}: ${it.value}" }
//            .joinToString("\n")
//    }
//    fun printText() {
//        privatePrint()
//    }
//
//
//    protected open fun getProtectedClass() = ProtectedClass()
//    protected open fun verifyPublicField(value: String): Boolean {
//        return value.length < 3
//    }
//    private fun privatePrint() {
//        println("Печать из класса BaseClass")
//    }
//
//
//    private fun getPrivateClass() = PrivateClass()
//    protected class ProtectedClass
//    private class PrivateClass
//}
//class ChildrenClass(
//    val privateVal: String,
//    protectedVal: String,
//
//
//    publicVal: String
//) : BaseClass(privateVal, protectedVal, privateVal) {
//
//
//    override fun verifyPublicField(value: String): Boolean {
//        return value.length > 3
//    }
//
//
//    fun setProtectedField1 (value: String) {
//        protectedField = value
//    }
//
//
//    private fun privatePrint() {
//        println("Печать из класса ChildrenClass")
//    }
//}