fun mostrarTabuada(num: Int) {
    for(i in 0 .. 10){
        val res:Int = num * i
        println("$num x $i = $res")
    }
}

fun main() {
    val num: Int

    print("Digite um número: ")
    num = readln().toInt()

    mostrarTabuada(num)
}