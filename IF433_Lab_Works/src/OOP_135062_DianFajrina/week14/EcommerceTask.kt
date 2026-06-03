package oop_135062_dianfajrina.week14
import java.io.FileWriter

interface PricingStrategy {

    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {

    override fun calculate(price: Double): Double {

        return price
    }
}

class VipPricing : PricingStrategy {

    override fun calculate(price: Double): Double {

        return price * 0.90
    }
}


interface OrderRepository {

    fun saveOrder(
        itemName: String,
        finalPrice: Double
    )
}


class CsvOrderRepository(
    private val fileName: String
) : OrderRepository {

    override fun saveOrder(
        itemName: String,
        finalPrice: Double
    ) {

        FileWriter(fileName, true).use { writer ->

            writer.append(
                "$itemName,$finalPrice\n"
            )
        }
    }
}


interface NotificationService {

    fun sendNotification(message: String)
}


class EmailNotifier : NotificationService {

    override fun sendNotification(message: String) {

        println("Email terkirim: $message")
    }
}


class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        pricing: PricingStrategy
    ) {

        // Hitung harga menggunakan strategy
        val finalPrice =
            pricing.calculate(basePrice)

        println(
            "Memproses pesanan $itemName seharga $finalPrice"
        )

        // Simpan ke file CSV
        repo.saveOrder(
            itemName,
            finalPrice
        )

        // Kirim notifikasi
        notifier.sendNotification(
            "Pesanan $itemName Anda telah dikonfirmasi!"
        )
    }
}


fun main() {
    
    val repository =
        CsvOrderRepository("orders.csv")

    val notifier =
        EmailNotifier()

    val processor =
        SafeOrderProcessor(
            repository,
            notifier
        )

    processor.processOrder(
        itemName = "Laptop Gaming",
        basePrice = 15000000.0,
        pricing = VipPricing()
    )

    processor.processOrder(
        itemName = "Mouse Wireless",
        basePrice = 250000.0,
        pricing = RegularPricing()
    )
}