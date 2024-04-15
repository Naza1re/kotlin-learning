package org.example.streams

import kotlin.random.Random

fun main() {

    val result = getListOfRandomNumbers()
    val trueResult = result.filter { it % 5 == 0 || it % 3 == 0 }.map { it * it }.sortedDescending().map { "$it" }
    printCollection(trueResult)
}


fun printCollection(collection: List<String>) {
    for (item in 0 until collection.size-1) {
        println("${collection[item]} ")
    }
}



fun getListOfRandomNumbers() : List<Int> {
    val list = mutableListOf<Int>()
    for (i in 1 until 1000) {
        list.add((Math.random()*1000).toInt())
    }
    return list
}