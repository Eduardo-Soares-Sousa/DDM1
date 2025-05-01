class Person(
    val name: String,
    var isStudent: Boolean
) {
    // Método padrão public
    fun sayHello() {
        println("Hello! My name is $name.")
        showStatus()
    }

    private fun showStatus() {
        if(isStudent){
            println("Sou estudante.")
        }else{
            println("Estou trabalhando.")
        }
    }
}