fun main() {
    val idade = 20
    if(idade in 0 .. 12){
        println("Criança")
    }else if(idade in 13 ..<18){
        println("Adolecente")
    }else{
        println("Velho")
    }
}