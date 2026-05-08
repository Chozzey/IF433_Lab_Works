package oop_135062_dianfajrina.week11

fun main() {
    println("=== TEST EXTENSION FUNCTION ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")
}