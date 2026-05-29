package oop_135062_dianfajrina.week14

interface DiscountStrategy {
    fun apply(price: Double): Double
}

class StudentDiscount : DiscountStrategy {
    override fun apply(price: Double): Double = price * 0.80
}

class MemberDisconut : DiscountStrategy {
    override fun apply(price: Double): Double = price * 0.85
}

class SafeDiscountCalculator(private val strategy: DiscountStrategy) {
    fun calculate(price: Double) = strategy.apply(price)
}