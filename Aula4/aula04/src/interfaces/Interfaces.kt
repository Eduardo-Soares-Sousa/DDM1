package interfaces

interface Clickable {
    fun click()

    fun show() {
        println("Eu aceito cliques!")
    }
}

class Button : Clickable {
    override fun click() {
        println("Got click")
    }
}

fun main() {
    val btn = Button()
    btn.click()

    btn.show()
}