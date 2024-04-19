package org.example.OOP

class Address(val nameOfCity: String, val nameOfStreet: String, val numberOfHouse: Int) {


    operator fun component1() = nameOfCity
    operator fun component2() = nameOfStreet
    operator fun component3() = numberOfHouse


    fun copy(
        nameOfCity: String = this.nameOfCity,
        nameOfStreet: String = this.nameOfStreet,
        numberOfHouse: Int = this.numberOfHouse
    ): Address {
        return Address(nameOfCity, nameOfStreet, numberOfHouse)
    }
}