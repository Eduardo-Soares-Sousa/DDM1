fun encontrarMenor(num1: Int, num2: Int): Int {
    if(num1 < num2){
        return num1
    }else return num2
}

fun main() {
    val num1: Int
    val num2: Int

    print("Digite um número: ")
    num1 = readln().toInt()
    print("Digite outro número: ")
    num2 = readln().toInt()

    if(num1 == num2){
        println("Os número NÃO podem ser iguais!")
    }else{
        println("O menor número é: ${encontrarMenor(num1, num2)}")
    }
}