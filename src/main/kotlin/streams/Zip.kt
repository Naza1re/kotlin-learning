package org.example.streams

import kotlin.random.Random

fun main(){
    val numbers = mutableListOf<Int>()
    val names = mutableListOf<String>()
    generateRandomNumbers(numbers,10)
    generateRandomNames(names,12)

    for(i in 0..9){
        println("Name ${names[i]} with number ${numbers[i]}")
    }

    val users = names.zip(numbers)
    for(user in users){
        println("User ${user.first} ${user.second}")
    }


}

fun generateRandomNumbers(numbers:MutableList<Int>,size:Int){
  for(i in 0 until size){
      numbers.add(Random.nextInt())
  }
}
fun generateRandomNames(names:MutableList<String>,size:Int){
    for(i in 0 until size){
        names.add("Nastya")
    }
}