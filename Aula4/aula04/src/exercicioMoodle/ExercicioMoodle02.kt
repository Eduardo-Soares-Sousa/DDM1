package exercicioMoodle

import kotlin.math.sqrt

open abstract class Media {
    open abstract fun calcular(x1: Double, x2: Double): Double

    companion object {
        fun aritmetica(): Media = Aritmetica()
        fun geometrica(): Media = Geometrica()
    }
}

class Geometrica : Media() {
    override fun calcular(x1: Double, x2: Double): Double {
        return sqrt((x1 * x2))
    }
}

class Aritmetica : Media() {
    override fun calcular(x1: Double, x2: Double): Double {
        return (x1 + x2) / 2
    }
}

fun main() {
    val media = Media.geometrica()
    val res = media.calcular(5.0, 2.0)
    println("Média: $res")
}