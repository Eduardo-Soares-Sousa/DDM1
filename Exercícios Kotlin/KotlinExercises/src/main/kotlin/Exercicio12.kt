fun findFactorial(factorial: Int): Int {
    var aux1: Int
    var aux2: Int

    aux1 = 1
    aux2 = factorial
    while(aux2 > 0){
        aux1 *= aux2
        aux2 -= 1
    }
    return aux1
}

fun main() {
    val factorial: Int

    print("Digite um número e saiba seu fatorial: ")
    factorial = readln().toInt()

    if(factorial < 0){
        println("Não é permitido número negativo")
    }else{
        println("O fatorial de $factorial é: ${findFactorial(factorial)}")
    }
}