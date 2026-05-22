package oop_135062_dianfajrina.week13
import java.io.File

fun main() {
    println("=== TANPA use {} ===")

    val writer = File("manual_log.txt").printWriter()

    writer.println("Baris 1: Sistem dimulai")
    writer.println("Baris 2: Membuat stream manual")

    writer.close()
    println("File selesai ditulis dan stream ditutup.")
}