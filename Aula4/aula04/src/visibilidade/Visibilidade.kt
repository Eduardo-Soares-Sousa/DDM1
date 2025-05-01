package visibilidade

class Robo {
    private val modelo = "T-90M"

    private fun agir() {
        println("$modelo agindo")
    }

    fun getModelo() = this.modelo
}

fun main() {
    val robo = Robo()
    //println(robo.modelo) ".modelo" não é acessado por private e protected
    //robo.agir()

    println(robo.getModelo())
}