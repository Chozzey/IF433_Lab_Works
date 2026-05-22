package oop_135062_dianfajrina.week13
import java.io.File

fun main() {
    println("=== TEST UNSAFE RESOURCE HANDLING ===")

    val unsafeFile = File("unsafe_logs.txt")
    val writer = File("manual_log.txt").printWriter()

    writer.println("Baris 1: Sistem dimulai")
    writer.println("Baris 2: Membuat stream manual")

    writer.close()
    println("File selesai ditulis dan stream ditutup.")
}

println("\n=== TEST SAFE RESOURCE HANDLING ===")
val safeFile = File("safe_logs.txt")

safeFile.printWrite().use { out ->
    for (i in 1..100) {
        out.println("Safe Log entry #$i: System status OK.")
    }
}
println("100 baris log berhasil di-generate dengan sangat aman.")