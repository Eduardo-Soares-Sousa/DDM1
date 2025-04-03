fun ehPrimo(num: Int): Boolean {
    if(num < 2){
        return false
    }
    for(i in 2 until num){
        if(num % i == 0){
            return false
        }
    }
    return true
}

fun main() {
    val num: Int

    print("Digite um número para verificar se é primo: ")
    num = readln().toInt()

    if(num != null){
        if(ehPrimo(num)){
            println("$num é um número primo.")
        }else{
            println("$num não é um número primo.")
        }
    } else {
        println("Número inválido.")
    }
}
