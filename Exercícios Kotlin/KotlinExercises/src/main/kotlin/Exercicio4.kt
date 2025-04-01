fun area(raio: Int, pi: Double): Double {
    return pi * Math.pow(raio.toDouble(), 2.0)
}

fun main() {
    val raio: Int
    val pi = 3.14159

    print("Digite o raio do círculo: ")
    raio = readln().toInt()

    println("A área do círculo que têm $raio de raio é: ${area(raio, pi)}")
}