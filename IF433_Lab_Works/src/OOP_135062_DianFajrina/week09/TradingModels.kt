package oop_135062_dianfajrina.week09

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)