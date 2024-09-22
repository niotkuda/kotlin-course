package org.niotkuda.kotlincourse.lesson5
//1 task
fun main() {
    val initialIntensity = 100 //интенсивность начальная пропорциональна звуку после затухания
    val knowDampingCoefficient: Double = 0.7 //коэф. затухания


    val coefficient = 0.5


    val intensityWithKnownCoefficient = calculateDampedSoundIntensity(initialIntensity)

    println("Интенсивность звука с известным коэффициентом затухания: $intensityWithKnownCoefficient")

    val cargoValue: Double? = null //double null


//    val unknownDampingCoefficient: Double? = null //коэф.отсутствует

    fun intensityWithUnknownCoefficient = calculateDampedSoundIntensity(initialIntensity: Double, Double?): Double
    println("Интенсивность звука с неизвестным коэффициентом затухания: ${intensityWithUnknownCoefficient()}")


    val totalCost = calculateTotalShippingCost(cargoValue)

    println("Полная стоимость доставки $${"%.2f".format(totalCost)}")
    println(calculateTotalShippingCost(70.0) )
}

fun calculateDampedSoundIntensity(initialIntensity: Double, dampingCoefficient: Double?): {
    val effectiveDampingCoefficient = dampingCoefficient ?: 0.5
    return initialIntensity * effectiveDampingCoefficient
}
// узнать полную цену доставки груза. Доставка 50+0.5%(страховка)



fun calculateTotalShippingCost(cargoValue: Double?): Double {

    val effectiveCargoValue = cargoValue ?: 50.0
    val insurance = effectiveCargoValue * 0.005
    val totalShippingCost = effectiveCargoValue + insurance
    return totalShippingCost

}

