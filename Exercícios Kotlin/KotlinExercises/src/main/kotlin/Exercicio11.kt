import java.lang.Exception

class notFindDayWeek(message: String): Exception(message)

fun findDayWeek(day: Int){
    when(day){
        1 -> println("$day: Domingo.")
        2 -> println("$day: Segunda-feira.")
        3 -> println("$day: Terça-feira.")
        4 -> println("$day: Quarta-feira.")
        5 -> println("$day: Quinta-feira.")
        6 -> println("$day: Sexta-feira.")
        7 -> println("$day: Sábado.")
        else -> throw notFindDayWeek("Esse número não é válido.")
    }
}

fun main() {
    val day: Int

    print("Digite um número (1 - 7): ")
    day = readln().toInt()

    findDayWeek(day)
}