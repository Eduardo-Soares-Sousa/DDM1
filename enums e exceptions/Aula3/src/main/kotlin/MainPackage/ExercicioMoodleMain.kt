package MainPackage

import extensoes.isEven
import extensoes.milesToKm
import extensoes.weekday
import java.util.Date

fun main() {
    val num = 37
    println(num.isEven(num))

    val km = 50.5
    println(String.format("%.2f", km.milesToKm))

    val today = Date()
    println(today.weekday)
}