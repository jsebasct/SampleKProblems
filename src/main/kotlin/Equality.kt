data class Value(val s: String)

fun equals1(v1: Value?, v2: Value?): Boolean {
    return v1 == v2
}

fun equals2(v1: Value?, v2: Value?): Boolean {
    return v1?.equals(v2) ?: (v2 === null)
//    if (v1 == null && v2 == null) {
//        return true
//    } else {
//        if ( (v1 == null && v2 != null) || (v1 != null && v2 == null) ) {
//            return false
//        } else {
//            return v1?.equals(v2)!!
//        }
//    }
}

val originalPredicate = fun (x: Char): Boolean {
    return x == 'C'
}

val mul1 = fun(a: Int, b: Int): Int {
    return a * b
}

//val notPredicate: (Char) -> Boolean = fun (p1: Char): Boolean {
//    return originalPredicate(p1).not()
//}

val notPredicate: (Char) -> Boolean = { originalPredicate(it).not() }



fun main(args: Array<String>) {
//    equals1(Value("abc"), Value("abc")) eq true
//    equals1(Value("abc"), null) eq false
//    equals1(null, Value("abc")) eq false
//    equals1(null, null) eq true
//
//    equals2(Value("abc"), Value("abc")) eq true
//    equals2(Value("abc"), null) eq false
//    equals2(null, Value("abc")) eq false
//    equals2(null, null) eq true
}