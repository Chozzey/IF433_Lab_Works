package oop_135062_dianfajrina.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generic in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice =  PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.value}, Harga: ${itemPrice.value} USD")
    
    println("\n=== TEST CONSTRAINTS ===")
    val math = MathBox(10.5, 20) [cite: 90]
    println("Total: ${math.sum()}") [cite: 91]
    println("Terbesar: ${getMax(45, 90)}") [cite: 92]
}
