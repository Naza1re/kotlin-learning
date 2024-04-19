package org.example.OOP

fun main(){
   val worker = Worker("Nikita","HR",2004)
    println(worker.printInformation())


}
fun Worker.printInformation() : String{
    return "Worker with name : ${this.name} has stage : ${this.stage}";
}
fun Cat.isOld() = this.age >= 10