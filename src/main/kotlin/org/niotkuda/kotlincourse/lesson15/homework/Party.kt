package org.niotkuda.kotlincourse.lesson15.homework

class Party (
    val location: String,
    var attendees: Int
) {
    fun details(){
        println("Вечеринка будет проходить по адресу: $location, приглашены $attendees гостей")
    }
}