package extensoes

import java.text.SimpleDateFormat
import java.util.*

// Exercicio 1
fun Int.isEven(num: Int): Boolean {
    if(num % 2 == 0) {
        return true
    }
    return false
}

// Exercicio 2
fun Double.milesToKm(miles: Double): Double {
    return miles * 1.6
}

// Exercicio 3
val Date.weekday: String
    get() {
        val date = SimpleDateFormat("EEEE")
        return date.format(this)
    }