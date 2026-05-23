package oop_135062_dianfajrina.week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {

    return try {

        val parts = line.split(",")

        TradeRecord(
            parts[0].toInt(),
            parts[1],
            parts[2],
            parts[3].toDouble(),
            parts[4].toDouble()
        )

    } catch (e: Exception) {

        println("(Log) Data korup diabaikan: $line")

        null
    }
}

fun saveTrades(
    trades: List<TradeRecord>,
    path: String
) {

    File(path)
        .printWriter()
        .use { writer ->

            trades.forEach {
                writer.println(it.toCsv())
            }
        }
}

fun loadTrades(path: String): List<TradeRecord> {

    return try {

        File(path)
            .readLines()
            .mapNotNull {
                fromCsvTrade(it)
            }

    } catch (e: FileNotFoundException) {

        println("Error: File tidak ditemukan!")

        emptyList()
    }
}

fun main() {

    println("=== CRYPTO TRADE LOGGER ===")

    // Mock Data
    val trades = listOf(

        TradeRecord(
            1,
            "BTCUSDT",
            "Long",
            1000.0,
            150.0
        ),

        TradeRecord(
            2,
            "ETHUSDT",
            "Short",
            500.0,
            -50.0
        ),

        TradeRecord(
            3,
            "SOLUSDT",
            "Long",
            750.0,
            120.0
        )
    )


    // Save
    saveTrades(
        trades,
        "crypto_trades.csv"
    )

    File("crypto_trades.csv")
        .appendText(
            "CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n"
        )