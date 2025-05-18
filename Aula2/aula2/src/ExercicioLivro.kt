class ExercicioLivro (
    val titulo: String,
    val autor: String,
    val ano: Int
) {
    var emprestado: Boolean = false

    fun mostrarStatus(emprestado: Boolean): String {
        return if(emprestado) {
            "Atualmente emprestado."
        }else{
            "Disponível para empréstimo."
        }
    }

    val descricao: String
        get() {
            return "$titulo ($ano), $autor. ${mostrarStatus(emprestado)}"
        }

    fun emprestar() {
        emprestado = true
    }

    fun devolver() {
        emprestado = false
    }
}

fun main() {
    val livro = ExercicioLivro("Dom Casmurro", "Machado de Assis", 1899)

    println(livro.descricao)

    livro.emprestar()
    println(livro.descricao)

    livro.devolver()
    println(livro.descricao)
}