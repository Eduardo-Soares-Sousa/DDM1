fun main() {
    val frutas = listOf("Banana", "maçã", "uva", "goiaba")

    for(f in frutas){
        println(f)
    }

    println()

    var index = 0
    while(index < frutas.size){
        println(frutas[index])
        index++
    }

    println()

    for(i in 0 .. (frutas.size-1)){
        println(frutas[i])
    }
}