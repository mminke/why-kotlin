package nl.group9.kotlin.vs.java.examples

fun main() {
    println(exampleMethod("Kotlin"))
//    println(exampleMethod(null))        // <== Does not compile
}

fun exampleMethod(someParameter: String): String {
    return "Size of string is: ${someParameter.length}"
}
