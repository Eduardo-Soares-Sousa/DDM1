package extensoes

fun String.lastChar() = this.get(this.length-1)

fun String.lastWord() = this.split(" ").last()

fun main() {
    val msg = "Hello World!"
    println(msg.lastChar())
    println(msg.lastWord())
}