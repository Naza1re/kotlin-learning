package org.example.streams

fun main() {
    val list = getListOfElements()
    val listOfNumbers = list.filter { number: Int ->
        number % 2 == 0
    }
    println(listOfNumbers)


}

fun getListOfElements(): List<Int> {
    val list: MutableList<Int> = mutableListOf<Int>()
    for (item in 0..100) {
        list.add(item)
    }
    return list
}