package org.niotkuda.kotlincourse.lesson21

interface Mapper<T,R> {
    fun mapper(element: T): R
    fun mapperList(element: List<T>): List<R>
}