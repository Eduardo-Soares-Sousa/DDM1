fun isLeapYear(year: Int): Boolean {
    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        return true
    }else{
        return false
    }
}

fun main() {
    val year: Int

    print("Digite um ano e descubra se ele é bissexto: ")
    year = readln().toInt()

    if(isLeapYear(year)){
        println("O ano $year é bissexto!")
    }else{
        println("O ano $year não é bissexto!")
    }
}