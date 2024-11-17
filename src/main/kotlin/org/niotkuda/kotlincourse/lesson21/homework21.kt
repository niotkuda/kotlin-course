package org.niotkuda.kotlincourse.lesson21

fun main() {

    val keys = listOf(1,2,3,4,5)
    val values = listOf("1", "2", "3", "4", "5")
    println(toMap(keys,values))
    println("----------------------------------")
    val list = listOf(1,2,3)
    println(getMiddleElement(list))
    println("----------------------------------")
    val list1 = ListHolder<Int>()
    list1.addElement(1)
    list1.addElement(2)
    println(list1.getElements())
    println("----------------------------------")
    val list2 = PhrasesToListOfStrings()
    println(list2.mapper("1 qwe 66yy tyuo 888"))
    println("----------------------------------")
    val list3 = PhrasesToListOfStrings()
    println(list3.mapperList(listOf("123","234","345")))
    println("----------------------------------")
    val str = StringValidator()
    println(str.isValid("    hjhjh     "))
    println("----------------------------------")
    val num = OddValidator()
    println(num.isValid(8))
    println("----------------------------------")
    val list4 = ListValidator<Number>()
    println(list4.isValid(listOf(1,2,3)))

}

//Создайте функцию toMap<K, V>(keys: List<K>, values: List<V>): Map<K, V>, которая будет создавать карту из списков ключей и значений.
//Если ключей или значений больше, то оставшиеся ключи или значения не записываем в словарь.
fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    val result: MutableMap<K, V> = mutableMapOf()
    for (i in 0..< minOf(keys.size, values.size)) {result[keys[i]] = values[i]}
    return result
}

//Напишите функцию getMiddleElement<T>(list: List<T>): T?, которая будет возвращать средний элемент списка, если он существует.
fun <T> getMiddleElement(list: List<T>): T? {
    return if (list.isNotEmpty() && list.size % 2 != 0 && list.size != 1) {
        list[list.size / 2]
    }
    else null
}






//Требуется описать класс, интерфейс или функцию и реализовать предложенную логику в коде.
//
//Создайте функцию toMap<K, V>(keys: List<K>, values: List<V>): Map<K, V>, которая будет создавать карту из списков ключей и значений.
// Если ключей или значений больше, то оставшиеся ключи или значения не записываем в словарь.

//Напишите функцию getMiddleElement<T>(list: List<T>): T?, которая будет возвращать средний элемент списка, если он существует.
//Напишите класс ListHolder, который будет хранить список элементов типа T и иметь метод для добавления и получения всех элементов.
//Создайте интерфейс Mapper<T, R>, который будет определять метод для преобразования элементов типа T в элементы типа R.
//Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>.
// Метод преобразования должен разбивать входящую строку по символу пробела и возвращать список из полученных слов.
//Добавь к интерфейсу Mapper ещё один метод, который будет преобразовывать список элементов типа T в список элементов типа R.
// Реализуй этот метод в классе PhrasesToListOfStrings с аналогичной механикой.
//Напишите интерфейс Validator<T>, который будет проверять значение типа T на соответствие определенным условиям и возвращать булево значение (успешная или неуспешная проверка).
//Создай класс StringValidator и имплементируй интерфейс Validator с типом String?. Реализуй проверку, что строка не является null, не пустая и не состоит из одних пробелов.
//Создай класс OddValidator и имплементируй интерфейс Validator типизированный по Int. Реализуй проверку, что число чётное.
//Создай класс ListValidator
//с дженериком, ограниченным типом Number
//имплементируй интерфейс Validator
//типизированный по типу List с nullable типом дженерика класса
//Реализуй проверку:
//что ни один элемент списка не является null
//Ни один элемент приведённый к типу Double не равен 0.0
