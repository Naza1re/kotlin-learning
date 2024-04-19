package org.example.OOP

fun main() {

    val car:Transport = Car("BMW")
    if(car is Car) {
        car.startEngine()
    }
    val bycicle = Bycicle("Forward")
    object :Transport("Автобус"){
        override fun drive() {
            println("$name driving")
        }
    }



}