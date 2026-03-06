package oop_135062_dianfajrina.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {

        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran berhasil menggunakan Credit Card oleh $accountName")
            println("Total terpakai: $usedAmount")
        } else {
            println("Transaksi ditolak. Melebihi limit kartu kredit.")
        }
    }
}