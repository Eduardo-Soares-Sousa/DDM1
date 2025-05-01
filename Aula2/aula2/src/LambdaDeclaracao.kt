fun somar(a: Int, b: Int): Int {
    val res = a+b
    return res
}

// Recebe dois inteiros e retorna(->) um inteiro
val sub: (Int, Int) -> Int = {a: Int, b: Int -> a - b}
val mult = {a: Int, b: Int -> a * b}
val fazNadaDeUtil = {msg: String -> println(msg)}
//val fazNadaDeUtil: (String) -> Unit = {msg: String -> println(msg)}

fun main() {
    val res = sub(5, 2)
    println(res)

    fazNadaDeUtil("bla")
}