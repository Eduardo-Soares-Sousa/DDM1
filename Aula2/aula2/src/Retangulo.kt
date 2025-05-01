class Retangulo(
    val largura: Int,
    val altura: Int,
) {
    val isQuadrado: Boolean
        get() {
            return largura == altura
        }

    val area: Int
        get() {
            return largura * altura
        }
}

fun main() {
    val r1 = Retangulo(4, 2)
    println(r1.isQuadrado)
}