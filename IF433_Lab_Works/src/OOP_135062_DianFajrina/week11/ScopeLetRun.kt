package oop_135062_dianfajrina.week11

fun main() {

    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it") // 'it' merujuk pada name
        it.length // Mengembalikan nilai expression terakhir
    }
    println("Panjang nama: $length")
}