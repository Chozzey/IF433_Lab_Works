package oop_135062_dianfajrina.week09

fun main() {
    println("=== TEST LIST ===")

    val framework: List<String> = ListOf("Kotlin", "Java", "C++")
    println("immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85,90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: \$scores")
}