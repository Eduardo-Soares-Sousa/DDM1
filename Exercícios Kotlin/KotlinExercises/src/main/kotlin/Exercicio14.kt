fun main() {
    val limite = 320
    val hodometro = 99

    for(i in 0 until limite){
        val result = i % (hodometro + 1)
        println("Hodômetro: $result Km")
    }
}