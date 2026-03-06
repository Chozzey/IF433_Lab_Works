package oop_135062_dianfajrina.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {

        if (balance >= amount) {
            balance -= amount
            println("Pembayaran berhasil menggunakan EWallet oleh $accountName")
            println("Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup untuk pembayaran $accountName")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil. Saldo sekarang: $balance")
    }
}