import java.io.File

fun main () {
//    println("Hola Mundo")
//    val fileName = "src/words_with_numbers.txt"
//
//    var counter = 0
//    val lines = File(fileName).readLines()
//    for (line in lines) {
//        if (line.toIntOrNull() != null) {
//            counter++
//        }
//    }
//
//    println(counter)



    val fileName2 = "src/new.txt"
    val linesLength2 = File(fileName2).length()
    val lines2 = File(fileName2).readLines().size
    print("$linesLength2 $lines2")
}