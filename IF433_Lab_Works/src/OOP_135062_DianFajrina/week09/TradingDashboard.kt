package oop_135062_dianfajrina.week09

package oop_001_johnthor.week09

fun main() {
    // Checkpoint 11: Inisialisasi Data Uji
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 50, 2.5, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 15, 12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 25, -8.4, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 10, 5.0, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }

    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }
}