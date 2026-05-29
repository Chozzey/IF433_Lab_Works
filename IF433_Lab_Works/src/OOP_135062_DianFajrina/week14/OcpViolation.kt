package oop_135062_dianfajrina.week14

class DiscountCalculator {
    fun calculate(price: Double, type: String): Double {
        return when (type) {
            "student" -> price * 0.80
            "member" -> price * 0.85
            "employee" -> price * 0.70
            else -> price
        }
    }
}