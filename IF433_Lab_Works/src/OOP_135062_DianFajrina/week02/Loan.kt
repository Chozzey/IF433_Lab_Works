package oop_135062_dianfajrina.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1   // Default Argument = 1 hari
) {

    // Method untuk menghitung denda
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}
