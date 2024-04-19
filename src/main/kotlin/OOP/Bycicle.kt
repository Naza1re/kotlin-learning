package org.example.OOP

class Bycicle(name:String) : Transport(name) {
    override fun drive() {
        println("driving $name")
    }

}