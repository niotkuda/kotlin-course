package org.niotkuda.kotlincourse.lesson18.animals

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())
    animals.forEach { it.makeSound() }
}