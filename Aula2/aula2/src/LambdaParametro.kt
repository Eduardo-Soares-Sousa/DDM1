fun executar(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    val res = op(a, b)
    return res
}

fun main() {
    val total = executar(2, 3) {a, b -> a + b}
    println("Total: $total")

// Versão 2
//    val total = executar(2, 3, {a: Int, b: Int -> a + b})
//    println("Total: $total")

// Versão 1
//    val somar = {a: Int, b: Int -> a + b}
//    val total = executar(2, 3, somar)
//    println("Total: $total")
}