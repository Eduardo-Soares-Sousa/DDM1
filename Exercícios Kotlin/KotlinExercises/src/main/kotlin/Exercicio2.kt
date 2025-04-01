fun converter(metros: Double): Double{
    return metros * 1000
}

fun main() {
    val metros: Double

    print("Digite o comprimento em metro(m) para ser convertido para milímetro(mm): ")
    metros = readln().toDouble()

    println("$metros metros são ${converter(metros)} milímetros.")
}