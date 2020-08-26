import java.io.File

fun main () {
    println("Hola Mundo")
    val fileName = "src/words.txt"

    var counter = 0
    val lines = File(fileName).readText()
    val words = lines.split(" ").filter { it.trim().isNotEmpty() }

    println(words.size)
}