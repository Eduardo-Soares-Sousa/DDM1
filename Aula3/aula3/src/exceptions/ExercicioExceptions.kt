package exceptions

fun divisao(a: Int, b: Int): Int? =
    try {
        a / b
    }catch(e: ArithmeticException){
        null
    }


fun main() {
    val a = 10
    val b = 0
    val res = divisao(a, b)
    println(res)
}