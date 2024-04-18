package org.example.streams

fun main() {
    val data = mapOf(
        "file.txt" to listOf(1,5,5,1),
        "file2.txt" to listOf(1,12,2,12,4),
        "file3.txt" to listOf(-1,12,21,2,4)
    )


    val average = data.filter {it.value.all { it>=0 }}.flatMap { it.value }.average()
    println(average)

}