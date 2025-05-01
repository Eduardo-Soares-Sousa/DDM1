package visibilidade
//Não roda
class Customer(nome: String) {
    private val _nome: String

    init {
        _nome = nome
    }

    val nome: String
        get() = _nome

}

fun main() {
    val c = Customer("Maria")
    println(c.nome)
    //println(c.getNome())
}