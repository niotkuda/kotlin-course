//package org.niotkuda.kotlincourse.lesson20
//
//
//
//abstract class ProgramHardware : PowerDevice(), Programmable {
//    private var isActionProgrammed = false
//
//    override fun programAction(action: String) {
//        if (isTurnedOn) {
//            isActionProgrammed = true
//            println("действие: $action")
//        }
//    }
//
//    override fun execute() {
//        if (isTurnedOn && isActionProgrammed) println("выполнено")
//    }
//}
//
//
//
//
////Создай абстрактный класс для программируемого
//// оборудования (с имплементацией соответствующего интерфейса и реализацией методов)
//// и наследуй его от абстрактного класса включаемого оборудования.