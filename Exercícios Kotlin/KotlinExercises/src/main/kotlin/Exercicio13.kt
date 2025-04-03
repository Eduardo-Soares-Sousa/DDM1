fun fibonacciSerie() {
    var aux1 = 0
    var aux2 = 1

    print("Fibonacci: $aux1, $aux2")

    for(i in 0 .. 7){
        var next = aux1 + aux2
        print(", $next")
        aux1 = aux2
        aux2 = next
    }
}

fun main() {
    fibonacciSerie()
}