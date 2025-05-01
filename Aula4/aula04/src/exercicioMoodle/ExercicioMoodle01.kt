package exercicioMoodle

open class Veiculo(var placa: String) {

    open fun mover() {
        println("O veículo $placa está se movendo")
    }

    open fun parar() {
        println("$placa parou")
    }
}

class Onibus(placa: String) : Veiculo(placa) {
    override fun mover() {
        println("O ônibus $placa está se movendo.")
    }
}

class Carro(placa: String) : Veiculo(placa) {
    override fun mover() {
        println("O carro $placa está se movendo.")
    }
}

fun main() {
    val onibus = Onibus("RTX-3060")
    val carro = Carro("DAO-5478")

    onibus.mover()
    onibus.parar()

    carro.mover()
    carro.parar()
}