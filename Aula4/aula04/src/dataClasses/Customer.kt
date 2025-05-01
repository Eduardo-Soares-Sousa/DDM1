package dataClasses

class Customer(name: String, id: Int)

fun main() {
    val c = Customer("João", 23)
    println(c.toString())
}