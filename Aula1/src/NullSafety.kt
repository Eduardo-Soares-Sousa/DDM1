fun printLen(msg: String){
    val len = msg.length
    println("Tamanho: $len")
    //println("Tamanho: " + msg.length)
}

fun printLenient(msg: String?){
    println(msg ?: "n/d")
    println("Tamanho: " + msg?.length)
}

fun main() {
    val name: String = "Maria"
    val lastName: String? = null

    printLen(name)
    printLenient(lastName)
}