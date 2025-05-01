package enums

enum class dangerLevel() {
    BAIXO, MEDIO, ALTO;

    fun print() = println("(${BAIXO}, ${MEDIO}, ${ALTO})")
}

fun getDangerLevel(level: dangerLevel): String =
    when(level) {
        dangerLevel.BAIXO -> "Tudo funcionando perfeitamente"
        dangerLevel.MEDIO -> "Cuidado! Monitore os níveis de radiação"
        dangerLevel.ALTO -> "Fujam para as colinas"
    }

fun main() {
    val nivel = dangerLevel.ALTO
    nivel.print()
    println(nivel)
}