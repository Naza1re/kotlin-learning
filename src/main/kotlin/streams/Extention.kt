package org.example.streams

fun main() {
    val age = 15
    if (age.isAgeValid()) {
        println(age.isAgePositive())
        println("Age is valid")
    }

    if (age.isAgeValid()) {
        println("Age is valid 2")
    }
    if (age.isAgeValid()) {
        println("Age is valid 3")
    }
}

fun isValid(age: Int): Boolean {
    return age in 10..100
}

fun Int.isAgeValid() = this in 10..100
fun Int.isAgePositive() = this >= 0