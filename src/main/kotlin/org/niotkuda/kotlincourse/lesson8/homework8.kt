package org.niotkuda.kotlincourse.lesson8

fun main () {

//Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования, делая текст более ироничным или забавным. Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу.
//Правила Проверки и Преобразования:
//
//    println(convert("Это невозможно выполнить за один день."))
//    println(convert("Я не уверен в успехе этого проекта"))
//    println(convert("Произошла катастрофа на сервере"))
//    println(convert("Этот код работает без проблем"))
//    println(convert("Удача"))
//
//
//
//}
//
//fun convert(text: String) : String {
//return when {
//    "невозможно" in text -> text.replace("невозможно", "совершенно точно возможно, просто требует времени")
//    text.startsWith("Я не уверен" -> $text.replace("но моя интуиция говорит об обратном")
//}
//}
//val maskNumber
// Оставляем последние 4 цифры
//    val lastFourDigits = number.takeLast(4)
//
//    // Заменяем все остальные цифры на звездочки, включая пробелы
//    val maskedNumber = number.dropLast(4).replace(Regex("\\d"), "*")
//
//    // Выводим замаскированный номер карты
//    println("$maskedNumber$lastFourDigits")
//fun replaceString (String) : String{
//    return when "невозможно"}
//


////    Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
////    Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
//    //  Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.  ????
//
    val dataFromStringLong = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val substring = dataFromStringLong.substring(32, 42)
    val substring2 = dataFromStringLong.substring(44)
    println(substring)
    println(substring2)


//    val dataFromStringLong1 = "Пользователь вошел в систему -> 2021-12-01 09:48:23".indexOf("2021-12-01")
//    val dataFromStringLong2 = "Пользователь вошел в систему -> 2021-12-01 09:48:23".indexOf("09:48:23")
//println(dataFromStringLong1)
//    println(dataFromStringLong2)
//}

//    val dataFromStringLong1 = "Пользователь вошел в систему -> 2021-12-01 09:48:23".indexOf("2021-12-01")
//
//
//val dataFromStringLong = "Пользователь вошел в систему -> 2021-12-01 09:48:23".split("1 ")
//println(dataFromStringLong)


//    Задание 2: Маскирование Личных Данных
//    Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".

//val number = "4539 1488 0343 6467"
//val lastFourSymbols = number.takeLast(4)
//val


//    Задание 3: Форматирование Адреса Электронной Почты. Используй replace
//    Описание: У вас есть электронный адрес "username@example.com". Преобразуйте его в строку "username [at] example [dot] com".


//    Задание 4: Извлечение Имени Файла из Пути
//    Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.

    val filePath = "C:/Пользователи/Документы/report.txt"
    val fileName = filePath.substring(25)
    println(fileName)



//    Задание 5: Создание Аббревиатуры из Фразы. Используй split с набором символов для разделения. Используй for для перебора слов. Используй var переменную для накопления первых букв.
//    Описание: У вас есть фраза, например "Объектно-ориентированное программирование". Создайте аббревиатуру из начальных букв слов (например, "ООП").

var phrase = "Объектно-ориентированное программирование"
    for
}