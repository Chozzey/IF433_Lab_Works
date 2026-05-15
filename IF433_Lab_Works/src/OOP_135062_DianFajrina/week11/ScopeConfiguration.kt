package oop_135062_dianfajrina.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {
    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Tzuyu"
        age = 25
    }
    println(user)
}