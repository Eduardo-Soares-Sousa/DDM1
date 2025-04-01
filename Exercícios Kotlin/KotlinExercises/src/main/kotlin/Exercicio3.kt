fun converter(temp: Int): Double {
    return 32 + ((9*temp.toDouble())/5)
}

fun main() {
    val temp: Int

    print("Digite a temperatura para a conversão: ")
    temp = readln().toInt()

    println("$temp graus Celsius equivale a ${converter(temp)} Fahrenheit")
}