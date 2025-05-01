package heranca

open class Animal {
    open fun sayHello() {
        println("Eu sou um animal")
    }

    fun eat() {
        println("Animal comendo")
    }
}

class Cavalo : Animal() {
    override fun sayHello() {
        println("Eu sou um cavalo.")
    }
}

fun main() {
    val a1: Animal = Animal()
    val a2: Animal = Cavalo()

    a1.sayHello()
    a2.sayHello()
}