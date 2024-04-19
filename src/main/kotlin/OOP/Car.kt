package org.example.OOP

class Car(name:String) : Transport(name) {
    override fun drive() {
        println("Driving $name")
    }

    fun startEngine() : Boolean {
        println("Trying to start engine.....")
        Thread.sleep(1000)
        println("Engine was started")
        return true
    }


}