package org.niotkuda.kotlincourse.lesson14

//                    СЛОВАРИ

fun main() {


    val fruitsPrices = mapOf(
        "apple" to 2.99,
        "banana" to 1.99,
        "cherry" to 3.99) //
// при создании словаря используем пары,
// но в самом словаре пэир как структура данных не используются
    // данные в словаре хранятся в виде класса Map.Entry
//entries указываем что в цикл будет попадать entries
    for (entry in fruitsPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }

    for (entry in fruitsPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }

//деструктуризация (key, value) название переменных рандомных
//термин касается только словарей, приминителен к словарям
for ((fruit, price) in fruitsPrices) {
    println("Key: $fruit, Value: $price")
}



// получение данных из словаря

    val entries = fruitsPrices.entries //вернёт список/коллекцию элементов (из типов мап энтрис)
    val keys = fruitsPrices.keys // возвращает коллекцию ключей
    val values = fruitsPrices.values //возвращает коллекцию значений


    // МЕТОДЫ ПОЛУЧЕНИЯ ЭЛЕМЕНТОВ

    val priceOfPearOrElse = fruitsPrices.getOrElse("pear") { throw IllegalArgumentException() } //Предлагает получить значение по ключу
    val priceOfApple = fruitsPrices.getValue("apple") // возвращает значение по ключу в виде нотналбл /fruitsPrices["pear"]!!
    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0)




    val fruitsWithoutBanana = fruitsPrices - "banana" //вычитаем строку из словаря. - это метод. Метод создаёт словарь включающий в себя все эл-ты кроме банана
    val fruitsWithPineapple = fruitsPrices + ("pineapple" to 3.5) // + с помощью метода можно добавить новую пару значений. Создастся новый словарь и плюс пара
    val mutableFruits = fruitsPrices.toMutableMap() //создаёт новый изменяемый словарь


    mutableFruits["kiwi"] = 2.75 // Добавление элемента
    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9)) //позволяет взять другой словарь и все его эл-ты добавить
    mutableFruits.remove("apple") // Удаление элемента по ключу
    mutableFruits.clear() //полностью очистит изменяемый словарь



    // Набор методов, которые выполняют разнообразные проверки

    val containsApple = fruitsPrices.containsKey("apple")  // если в списках есть метод containsKey, который проверяет наличие ключа в словаре
//  contains
    val containsValue1_5 = fruitsPrices.containsValue(1.5)
    val isEmpty = fruitsPrices.isEmpty() //проверяет является ли словарь не пустым
    val isNotEmpty = fruitsPrices.isNotEmpty()

    //методы проверяют словари на выполнение условия булево значение
    val areAllFruitsExpensive = fruitsPrices.all { it.value > 1.0 }  // говорит о том что все эл-ты словаря должны соответствовать условию, если соотв вернёт тру
    val isAnyFruitCheap = fruitsPrices.any { it.value < 1.0 } //говорит о том что если любой из элементов словаря будет соответствовать условию то будет тру


    val filteredByPrice = fruitsPrices.filter { it.value > 1.0 }
    val filteredByKeys = fruitsPrices.filterKeys { it.startsWith("a") }
    val filteredByValues = fruitsPrices.filterValues { it < 2.0 }
    val filteredNotApple = fruitsPrices.filterNot { it.key == "apple" }
    val countExpensiveFruits = fruitsPrices.count { it.value > 1.5 }
    val increasedPrices = fruitsPrices.mapValues { it.value * 1.1 }
    val fruitNamesUppercase = fruitsPrices.mapKeys { it.key.uppercase() }
    val fruitsList = fruitsPrices.map { "${it.key} costs ${it.value}" }
    val toMap = mutableFruits.toMap()
    val toMutableMap = fruitsPrices.toMutableMap()
    fruitsPrices.forEach { (fruit, price) ->
        println("$fruit costs $price")
    }
    fruitsPrices.forEach {
        println("${it.key} costs ${it.value}")

//ПРАКТИКА 20:15
    }
    fun classWork() {
        val map = mapOf<String, Int>()
        for (entry in map.entries)
            println("${entry.key} = ${entry.value} ")
        println(map.values)
        println(map.keys)
    }

    val mapProductCount = mapOf<String, Int>()
    println(mapProductCount.getOrElse("apple") { throw Exception("not apple") })
    println(mapProductCount.containsKey("apple"))
    println(mapProductCount.containsValue(10))

    val lisFruit = mapProductCount.map {"Product ${it.key} in ${it.value}"}

    mapProductCount.isEmpty()
    mapProductCount.isNotEmpty()
    val allTens = mapProductCount.all { it.value > 10 } // передаем в ф-ю аргумент entry.
// all это перебор всех эл-тов словаря в цикле for.
// каждый эл-т словаря это it

val moreThanHundred = mapProductCount.any { it.value > 100}

    mapProductCount.filterValues { it > 100 }

   val mutableProduct = mapProductCount.toMutableMap()
    mutableProduct.remove("pineapple")
    mutableProduct.putAll(mapOf())
    mutableProduct.clear()



}