package oop_135062_dianfajrina.week05

fun main() {

    val ewallet = EWallet("Tzuyu", 50000.0)
    val creditCard = CreditCard("Tzuyu", 100000.0)

    val payments: List<PaymentMethod> = listOf(ewallet, creditCard)

    println("=== SISTEM PEMBAYARAN ===")

    for (payment in payments) {
        payment.processPayment(75000.0)
        println()
    }
}