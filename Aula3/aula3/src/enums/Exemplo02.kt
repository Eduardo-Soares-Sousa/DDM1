package enums

enum class Color2(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    fun print() = println("($r, $g, $b)")
}

fun getColorName(color: Color2): String =
    when(color) {
        Color2.RED -> "Vermelho"
        Color2.GREEN -> "Verde"
        Color2.BLUE -> "Azul"
    }


fun main() {
    val color = Color2.RED
    color.print()
    println(getColorName(color))
}