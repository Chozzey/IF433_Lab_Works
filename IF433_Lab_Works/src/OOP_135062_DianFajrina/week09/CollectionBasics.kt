package oop_135062_dianfajrina.week09

fun main() {
    println("=== TEST LIST ===")

    val framework: List<String> = ListOf("Kotlin", "Java", "C++")
    println("immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85,90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: \$scores")

    println("=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("Active Users: $activeUsers")
}