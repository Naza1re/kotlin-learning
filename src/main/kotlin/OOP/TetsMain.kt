package org.example.OOP

fun main() {

    val student = Student("Nikita","Suragatov","132312")
    val student2 = Student("Nikita","Suragatov","132312")

    println(student)
    println(student2)
    println(student.hashCode())
    println(student2.hashCode())
    println(student == student2)
    println(student === student2)
}