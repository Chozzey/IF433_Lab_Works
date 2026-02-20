package oop_135062_dianfajrina.week03

fun main() {
    val e = Employee("Tzuyu")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}

