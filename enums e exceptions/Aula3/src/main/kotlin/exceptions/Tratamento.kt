package exceptions

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }catch(e: NumberFormatException) {
        return null
    }finally {
        reader.close()
    }
}

fun main() {
    val reader = BufferedReader(StringReader("batatinha"))
    val num = readNumber(reader)
    println(num)
}