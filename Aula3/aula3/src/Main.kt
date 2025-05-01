import extensoes.lastChar
import extensoes.lastWord
import extensoes.pol
import extensoes.weekday
import java.util.Date

fun main() {
    val msg = "Hello World!"
    println(msg.lastChar())
    println(msg.lastWord())

    val largura = 2.pol
    println("Largura: $largura")

    val today = Date()
    println(today.weekday)
}