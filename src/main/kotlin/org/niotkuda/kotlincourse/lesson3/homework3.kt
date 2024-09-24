import com.sun.jdi.Field

/*package org.niotkuda.kotlincourse.lesson3

class homework {
    //Lesson
}
val name: String = "Hakkaton"

var date: String = "01.10.2024"

var place: String = "Moscow"

private val budget: String = "100000"

var member: Int = 0
    get() = field
    private set (value) {field=value}

var duration: Long = 6*60*60 //

private lateinit var contacts: String //

var status: String = "Не начат"

val sponsors: String = "Имена, фамилии"

var internetAccessLevel: Int = 0

val mood: String by Lazy{""}

private var information: String = "Информация"

lateinit var plan: String

lateinit var specialGuest: String

var numberOfCommands: Int = 0

val tasks: String = ""

val evacuation: String = "picture"

var listOfAvailableEquipment: String = ""

var ListOfFreeEquipment: String = "50" //список свободного оборудования будет через логику проставлен

val planInCaseOfFailures: String = "План мероприятия на случай сбоев" //check

 */

// PRACTICE 22/9
//Название мероприятия
val name: String = "HAKKATON"
//Дата проведения
var date: String = "22.11.2024"
//Место проведения
var place: String = "Moscow"
//Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
val lazyValue: String by lazy {  //just String
    "budjet"
}
val money: Double = 10000.00 //or int
//Количество участников
var quantity: Int = 50
//Длительность хакатона
var time: Double = 500.60 //не так
var duration: Long = 8*60*60
//Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
val lazyValue: String by lazy {
    "something"
}
//Текущее состояние хакатона (статус)
var status: String = "Не начат"

//Список спонсоров
val list: String = "list with sponsors"

//Бюджет мероприятия
val moneyM: Int = 100000
//Текущий уровень доступа к интернету будет обновляться? должен быть привязан онлайн к чему-то
var internetAccessLevel1: Int = 4

//Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
private var information: String = "Info about"
//Количество команд
val command: Int = 20
//Перечень задач
val tasks: String = "list"
//План эвакуации
val planEvacuation: String = "picture"
//Список доступного оборудования
var listOborudov: String = "50"
//Список свободного оборудования
var listFreeOborudov: String = "50"
//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
lateinit var grafic: String
//План мероприятий на случай сбоев
val planB: String = "text with plan"
//Список экспертов и жюри
val typeListExperts: String "expert"
//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
private var lazyValue by lazy { ""
}
//Политика конфиденциальности
private val lazyValue by lazy { "" } //just String!

//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
private var feedback: String = "" //NO
private var lazyValue by lazy {}
//Текущая температура в помещении
var temperature: Int = 25

//Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
var analis: String = "ok"

//Уровень освещения
val lump: Int = 1100

//Лог событий мероприятия ??
private var log: String = "i494u93"

//Доступность медицинской помощи
val medicalHelp: String = "Yes?"

//Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
private val plocedure: String = ""

//Регистрационный номер мероприятия
val number: String = "32763623712"

//Максимально допустимый уровень шума в помещении хакатона.
val count: Int = 20

//Индикатор превышения уровня шума в помещениях
var count: Int = 20
    get() = Field
    set(value) {
        if (value >20) field = value
    }
var indicator: Boolean = true
if count //ИСПРАВИТЬ
//Формат мероприятия (зависит от геополитической обстановки)
var format: String = "format"

//Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
var count: Int = 30
    get() = field
    set(value) {
        if(value >= 0) field = value
    }

//План взаимодействия с прессой
val pressaPlan: String = ""

//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
val lazyValue by lazy {

}
//Статус получения всех необходимых разрешений
var status: String = "ok"
//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
var openDostup: String = "true/false"
//Список партнеров мероприятия
val listOfPartners: String = "fio"
//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
lateinit var  otchet: String = ""
//План распределения призов
val prizePlan: String = "plan"
//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
private val listWithNumbers: String = "blabla"
//Особые условия для участников с ограниченными возможностями
val condition: String = "cond"
//Общее настроение участников (определяется опросами) ??
//Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
lateinit var planHakkaton: String = ""
//Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
lateinit var nameOfGuest: String = ""
//Максимальное количество людей, которое может вместить место проведения.
val peopleHak: Int = 100
//Стандартное количество часов, отведенное каждой команде для работы над проектом.
val hours: Double = 600.00
