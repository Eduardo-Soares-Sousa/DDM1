class Livro (
    val titulo: String,
    val autor: String,
    val anoPublicacao: Int,
) {
    var estaEmprestado: Boolean = false

    val descricao: String
        get() {
            return if(estaEmprestado) {
                "$titulo ($anoPublicacao), de $autor. Atualmente emprestado."
            }else{
                "$titulo ($anoPublicacao), de $autor. Disponível para empréstimo."
            }
        }

    fun emprestar() {
        return if(!estaEmprestado){
            estaEmprestado = true
            println("O livro $titulo foi emprestado")
        }else{
            println("O livro O livro $titulo já foi emprestado")
        }
    }

    fun devolver() {
        return if(estaEmprestado){
            estaEmprestado = false
            println("O livro $titulo foi devolvido")
        }else{
            println("O livro O livro $titulo não está emprestado")
        }
    }
}

fun main() {
    val livro = Livro("Dom Casmurro", "Machado de Assis", 1899)

    println(livro.descricao)
    livro.emprestar()

    println(livro.descricao)
    livro.devolver()

    println(livro.descricao)
    livro.devolver()
}

