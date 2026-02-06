package oop_135062_dianfajrina.week01

fun main() {
    val gameTitle = "Forza Horizon 5 - Standard Edition"
    val price = 699000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 20 / 100 else price * 10 / 100
