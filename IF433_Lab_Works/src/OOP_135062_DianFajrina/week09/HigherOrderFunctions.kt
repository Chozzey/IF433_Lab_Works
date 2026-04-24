package oop_135062_dianfajrina.week09

fun main() {
    val numbers = ListOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("Original Data: $numbers")
    println("\n=== HOF: FILTER ===")

    val evens = numbers/filter { it % 2 == 0 }
    println("Evens only: $evens")
}