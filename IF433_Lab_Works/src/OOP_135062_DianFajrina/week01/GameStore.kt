package oop_135062_dianfajrina.week01

fun main() {
    val gameTitle = "Forza Horizon 5 - Standard Edition"
    val price = 699000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 20 / 100 else price * 10 / 100

fun printReceipt(
    title: String,
    originalPrice: Int,
    finalPrice: Int,
    note: String?
) {
    println("Judul Game : $title")
    println("Harga Asli : Rp $originalPrice")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan    : ${note ?: "Tidak ada catatan"}")
}