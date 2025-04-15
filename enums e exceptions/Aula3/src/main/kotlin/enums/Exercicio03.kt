package enums

enum class dangerLevel(val msg: String) {
    BAIXO("Tudo funcionando perfeitamente"), MEDIO("Cuidado! Monitore os níveis de radiação"), ALTO("Fujam para as colinas");

    fun print() = println(msg)
}

fun main() {
    val nivel = dangerLevel.ALTO
    nivel.print()
}