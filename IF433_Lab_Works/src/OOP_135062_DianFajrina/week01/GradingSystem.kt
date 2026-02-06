package OOP_135062_DianFajrina.week01

fun main() {
    val name = "Chou Tzuyu"
    val score = 100

    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade: $grade")
}