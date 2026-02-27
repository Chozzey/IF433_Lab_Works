package oop_135062_dianfajrina.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- SISTEM PEMINJAMAN BUKU ---")

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // Validasi: tidak boleh minus
    if (duration < 0) {
        println("Durasi tidak valid, otomatis diubah menjadi 1 hari.")
        duration = 1
    }

    // Membuat objek Loan
    val loan = Loan(title, borrower, duration)

    // Menampilkan hasil
    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam     : ${loan.borrower}")
    println("Durasi Pinjam: ${loan.loanDuration} hari")
    println("Total Denda  : Rp ${loan.calculateFine()}")
}
