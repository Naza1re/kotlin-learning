package org.example.OOP

import java.time.LocalDateTime

class Worker(val name: String,val jobTitle:String , val dateOfEmployeeing: Int) {

    val stage: Int
        get() = LocalDateTime.now().year-dateOfEmployeeing

    fun work() {
        println("Worker $name work....")
    }
}