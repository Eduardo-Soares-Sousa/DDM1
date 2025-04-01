fun imcCount(peso: Double, altura: Double): Double {
    return peso / (Math.pow(altura, 2.0))
}

fun classificaoImc(imc: Double): String {
    return when{
        imc < 18.5 -> "Abaixo do peso"
        imc >= 18.5 && imc < 25.0 -> "Eutrófico"
        imc >= 25.0 && imc < 30.0 -> "Sobrepeso"
        else -> "Obesidade"
    }
}

fun main() {
    val peso: Double
    val altura: Double

    print("Digite seu peso: ")
    peso = readln().toDouble()

    print("Digite sua altura: ")
    altura = readln().toDouble()

    val imc = imcCount(peso, altura)

    println("Seu IMC é: " + "%.2f".format(imc))
    println("Você é classificado como: ${classificaoImc(imc)}")
}