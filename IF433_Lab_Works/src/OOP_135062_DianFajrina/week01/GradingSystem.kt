package oop_135062_dianfajrina.week01

fun main() {
    val name = "Chou Tzuyu"
    val score = 100
    val studentId: String? = null
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")

    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade: $grade")
    println("Status: ${calculateStatus(score)}")
}

fun calculateStatus(score: Int) =
    if (score > 75) "Lulus" else "Tidak Lulus"