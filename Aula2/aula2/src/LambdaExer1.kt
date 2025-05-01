fun transform(a: String, op: (String) -> String): String {
    return op(a)
}


fun transformar(a: String, op: (String) -> String): String{
    var transform = op(a).uppercase()
    return transform
}

fun firstLetterString(a: String, op: (String) -> String): Char {
    var letter = op(a).first()
    return letter
}

fun main() {
    // it - usado quando o lambda possui apenas um argumento
    println("${transform("Batata frita") {it.uppercase()}}")
    println("${transformar("Hello") {a -> a}}")
    println("${transformar("Hello", {a: String -> a})}")
    println("${firstLetterString("World!") {a -> a}}")
}