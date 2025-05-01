fun somar(a: Int, b: Int): Int {
    val res = a + b
    return res
}

fun mult(a: Int, b: Int) = a * b

fun myPrint(msg: String): Unit {
    println(msg)
}

fun main(args: Array<String>) {
    var a: Int = 3
    val b = 5
    a = b

    val total = somar(a, 8)
    println(total)

    println(mult(a, 5))
}
