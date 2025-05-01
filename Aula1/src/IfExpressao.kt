fun myMax(a: Int, b: Int) = if(a > b) a else b

fun main() {
    val preco = 200.0
    val precoVista = if (preco > 100) {
        0.9 * preco
    }else{
        0.95 * preco
    }

    println("Preço à vista: " + precoVista)
}