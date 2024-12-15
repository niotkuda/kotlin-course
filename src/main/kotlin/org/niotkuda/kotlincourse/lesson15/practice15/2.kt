package org.niotkuda.kotlincourse.lesson15.practice15

import org.niotkuda.kotlincourse.lesson15.Person

fun main() {

    val person = Person("John", 30) // person(age = 30, name = "John") котлин позволяет указывать аргументы через указание имени аргумента
    // если мы аргументы не прописываем, то нужно соблюсти порядок полей. name 1, age 2 тогда аргументы не нужно указывать
    // в большинстве случаев аргументы не указываем они захламляют код. Главное порядок их вызова соблюдать
//класс позволяет установить дефолтное значение для аргумента
    person.sayHello()

}


