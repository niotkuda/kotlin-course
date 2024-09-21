package org.niotkuda.kotlincourse.lesson5
//1 task
fun main() {
    val initialIntensity = 100 //интенсивность начальная пропорциональна звуку после затухания
   val coefficient = 0.5

    val cargoValue: Double? = null //double null

    val totalCost = calculateTotalShippingCost(cargoValue)

    println("Полная стоимость доставки $${"%.2f".format(totalCost)}")
    println(calculateTotalShippingCost(70.0) )
}

//рассчитать предполаг.инт.звука после затухания


// узнать полную цену доставки груза. Доставка 50+0.5%(страховка)



fun calculateTotalShippingCost(cargoValue: Double?): Double {

    val effectiveCargoValue = cargoValue ?: 50.0
    val insurance = effectiveCargoValue * 0.005
    val totalShippingCost = effectiveCargoValue + insurance
    return totalShippingCost

}

