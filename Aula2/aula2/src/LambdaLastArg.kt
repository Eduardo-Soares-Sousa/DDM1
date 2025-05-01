fun executar(f: () -> Unit) {
    f()
}

fun main() {
    executar {println("Que feio!")}
}