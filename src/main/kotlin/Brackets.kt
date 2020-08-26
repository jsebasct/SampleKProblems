// you can also use imports, for example:
// import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")


fun MutableList<Char>.push(elem: Char) = this.add(elem)

fun MutableList<Char>.pop(): Char {
    return this.removeAt(this.lastIndex)
}

fun solution(S: String): Int {
    val input = S
    val stack: MutableList<Char> = mutableListOf()

    for (character in input) {
        if (isOpenSymbol(character)) {
            stack.push(character)
        } else {
            if (stack.isNotEmpty()) {
                var elem = stack.pop()
                if ( getCloseSymbol(elem) != character ) {
                    return 0
                }
            } else return 0
        }
    }

    return if (stack.isEmpty()) 1 else 0
}

fun isOpenSymbol(someChar: Char): Boolean {
    return someChar == '(' || someChar == '[' || someChar == '{'
}

fun getCloseSymbol(someChar: Char): Char {
    return when (someChar) {
        '(' -> ')'
        '[' -> ']'
        '{' -> '}'
        else -> throw Exception("Unknow Element Exception!")
    }
}

fun main() {
    println(solution( "{{{{" ))
}