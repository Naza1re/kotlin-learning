package org.example.OOP

fun main() {


    val address = Address("Moscov","Zelenaya",12)
    val address2 = address.copy()


    println(address)
    println(address2)
    println(address.hashCode())
    println(address2.hashCode())
    val (name,street,number) = address
    val (name2,street2,number2) = address2
    println(address == address2)
    println(address === address2)

}