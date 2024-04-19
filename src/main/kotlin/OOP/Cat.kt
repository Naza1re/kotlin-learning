package org.example.OOP

class Cat(val name:String,val age:Int,val weight: Float = 0F) {

    fun println(){
        println("$name is $age years old, and weight is $weight")
    }

    fun isAdult() : Boolean{
        return age > 10
    }
}