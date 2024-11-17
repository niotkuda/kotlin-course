package org.niotkuda.kotlincourse.lesson21

class ListHolder<T>() {
    var list: MutableList<T> = mutableListOf()

    fun addElement(element: T) {list += element}

    fun getElements(): List<T>{return list}

}