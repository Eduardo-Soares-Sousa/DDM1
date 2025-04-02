fun ehBissexto(ano: Int) {
    if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
        println("O ano $ano é bissexto")
    }else{
        println("O ano $ano não é bissexto")
    }
}

fun main() {
    val ano: Int

    print("Digite um ano e descubra se ele é bissexto: ")
    ano = readln().toInt()

    ehBissexto(ano)
}