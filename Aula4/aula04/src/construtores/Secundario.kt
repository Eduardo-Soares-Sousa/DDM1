package construtores

class Customer {
    var name: String

    constructor(name: String?) {
        this.name = name ?: "Joe"
    }

    constructor() {
        this.name = "Marry"
    }
}

fun main() {
    val customers = listOf(
        Customer("Moe"), Customer("Larry"),
        Customer("Curly"), Customer(null)
    )

    for(c in customers) {
        println(c.name)
    }
}