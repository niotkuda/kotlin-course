//package org.niotkuda.kotlincourse.lesson5
////1 task
//fun main1() {
//    val initialIntensity = 100 //интенсивность начальная пропорциональна звуку после затухания
//    val knowDampingCoefficient: Double = 0.7 //коэф. затухания
//
//
//    val coefficient = 0.5
//
//
//    val intensityWithKnownCoefficient = calculateDampedSoundIntensity (initialIntensity)
//
//    println("Интенсивность звука с известным коэффициентом затухания: $intensityWithKnownCoefficient")
//
//    val cargoValue: Double? = null //double null
//
//
////    val unknownDampingCoefficient: Double? = null //коэф.отсутствует
//
//    fun intensityWithUnknownCoefficient = calculateDampedSoundIntensity(initialIntensity: Double):
//    println("Интенсивность звука с неизвестным коэффициентом затухания: ${intensityWithUnknownCoefficient()}")
//
//
//    val totalCost = calculateTotalShippingCost(cargoValue)
//
//    println("Полная стоимость доставки $${"%.2f".format(totalCost)}")
//    println(calculateTotalShippingCost(70.0) )
//}
//
//fun calculateDampedSoundIntensity(initialIntensity: Double, dampingCoefficient: Double?): {
//    val effectiveDampingCoefficient = dampingCoefficient ?: 0.5
//    return initialIntensity * effectiveDampingCoefficient
//}
//// узнать полную цену доставки груза. Доставка 50+0.5%(страховка)
//
//
//
//fun calculateTotalShippingCost(cargoValue: Double?): Double {
//
//    val effectiveCargoValue = cargoValue ?: 50.0
//    val insurance = effectiveCargoValue * 0.005
//    val totalShippingCost = effectiveCargoValue + insurance
//    return totalShippingCost
//
//}
//







fun main (){
    printDelivery(15.9, null)
    printDelivery(100.0, 10.0)


}
fun printDelivery(delivery: Double, insuranse: Double? ){
    val delivery  = 50
    val insurense = delivery * 0.05
val totalDelivery = delivery + insurense
   println(delivery + insurense)
}





//Контекст: Вы изучаете физическое явление затухания звука в помещении. У вас есть измеренное значение начальной интенсивности звука, но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть неизвестны.
//Задача: Рассчитать предполагаемую интенсивность звука после затухания. Интенсивность звука после затухания пропорциональна начальной интенсивности, умноженной на коэффициент затухания. Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.
//======
//
//Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз, которая составляет 0,5% от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50
//Задача: Рассчитать полную стоимость доставки.
//=====
//
//
//
//Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление, которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять. Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.
