fun main() {
    val person = Person("João", true)
    println("Nome: " + person.name)
    println("Estudante: ${person.isStudent}")

    person.isStudent = false
    println("Estudante: ${person.isStudent}")

    person.sayHello()
}