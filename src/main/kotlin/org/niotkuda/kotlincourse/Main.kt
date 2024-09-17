package com.juliana.org.niotkuda.kotlincourse

val name: String = "Alice"

var age: Int = 30

const val PI = 3.14 // заметка

lateinit var userInf: String

/val lazyValue: String by lazy {
    "Hello world!"}

var speed: Double? = null

var count: Int = 0
    get() =  field
    set(value){
        if (value <= 0) field = value
        else
    }

lateinit var userInfo: String

val lazyValue: String by lazy {
    "What's going on?"
}
var speed: Double? = null

var count: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field = value
    }

val chassis: String = "12345abc"

var colour: String = "Purple"

var distance: Double = 0.0

lateinit var owner: String

const val WHEELS: Int = 4

val report: String by lazy {
    ''
}

var fuel: ouble = 0.0
    get() = field
    set(value) {
        if(value . 0) field
    }


/