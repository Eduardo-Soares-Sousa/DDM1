fun calculaMedia(nota1: Double, nota2: Double): Double {
    return (nota1 + nota2) / 2
}

fun main() {
    val nota1: Double
    val nota2: Double

    print("Digite a PRIMEIRA nota: ")
    nota1 = readln().toDouble()
    print("Digite a SEGUNDA nota: ")
    nota2 = readln().toDouble()

    when{
        calculaMedia(nota1, nota2) >= 7 -> println("Aprovado")
        else -> println("Reprovado")
    }
}