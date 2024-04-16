package org.example.streams

fun main(){



    val array = generateSequence("Employee number 1"){
        val index = it.substring(17).toInt()
        "Employee number: ${index+1}"
    }
    val list = array.take(100)
    for (i in list){
        println(i)
    }



}



fun printEmployees(employees: List<String>) {
    for(i in employees) {
        println(i)
    }
}




