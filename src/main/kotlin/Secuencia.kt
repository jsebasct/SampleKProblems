import java.util.*
import kotlin.random.Random;

fun fibonacci(): Sequence<Int> = sequence {
    var a = 0
    var b = 1
    yield(a)
    yield(b)

    var next = a + b
    yieldAll( generateSequence(next) {
        a = b
        b = next

        next = a + b
        next
    } )
}

fun main(){
    val sequence = generateSequence { Random.nextInt(5).takeIf {it > 0} }
    println(sequence.toList())
    println(fibonacci().take(9).toList())
}