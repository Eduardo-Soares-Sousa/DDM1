fun main() {
    val preco: Double = 200.0
    val precoVista: Double

    if(preco > 100){
        precoVista = 0.9 * preco
    }else{
        precoVista = 0.95 * preco
    }

    println("Preço à vista: " + precoVista)
}