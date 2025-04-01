fun somar(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun main() {
    val num1: Int
    val num2: Int

    print("Digite o PRIMEIRO número: ")
    num1 = readln().toInt()

    print("Digite o SEGUNDO número: ")
    num2 = readln().toInt()

    println("O resultado de $num1 + $num2 é: " + somar(num1, num2))
}