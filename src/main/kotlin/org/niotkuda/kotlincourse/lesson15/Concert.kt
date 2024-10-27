package org.niotkuda.kotlincourse.lesson15

class Concert(
    val band: String,
    val location: String,
    val ticketPrice: Double,
    val capacity: Int,
) {
    private var soldTickets: Int = 0
    fun info(){
        println("Концерт группы '$band' состоится по адресу: $location. Цена билета - $ticketPrice эскудо. Вместимость " +
                "зала $capacity. Уже продано $soldTickets билетов")
    }

    fun buyTicket() {
        if(soldTickets < capacity ) {
            soldTickets++
        } else {
            println("Мест нет!")
        }
    }
}