package org.example.streams

fun main() {
    val list = getListOfElements()
    val listOfNumbers = list.filter { number: Int ->
        number % 2 == 0
    }
    println(listOfNumbers)

    val listOfNames = getListOfNames()
    println(getCollectionWithNamesStartsWithLetterA(listOfNames))

}

fun getListOfElements(): List<Int> {
    val list: MutableList<Int> = mutableListOf<Int>()
    for (item in 0..100) {
        list.add(item)
    }
    return list
}


fun getListOfNames(): List<String> {
    val list: MutableList<String> = mutableListOf()
    list.add("John")
    list.add("Don")
    list.add("Argon")
    list.add("Madonna")
    return list
}

fun getCollectionWithNamesStartsWithLetterA(list: List<String>): List<String> {
    val filteredList = list.filter { name -> name.startsWith("A") }
    return filteredList
}