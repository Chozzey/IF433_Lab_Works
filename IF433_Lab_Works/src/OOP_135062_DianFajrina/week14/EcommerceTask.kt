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
        finalPrice: Double,
        customerType: String
    )
}

class CsvOrderRepository(
    private val fileName: String
) : OrderRepository {

    override fun saveOrder(
        itemName: String,
        finalPrice: Double,
        customerType: String
    ) {

        FileWriter(fileName, true).use { writer ->

            writer.append(
                "$itemName,$finalPrice,$customerType\n"
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
        customerType: String,
        pricing: PricingStrategy
    ) {

        // Hitung harga akhir
        val finalPrice = pricing.calculate(basePrice)

        println(
            "Memproses pesanan $itemName seharga $finalPrice"
        )

        // Simpan order ke CSV
        repo.saveOrder(
            itemName,
            finalPrice,
            customerType
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

    // Customer VIP
    processor.processOrder(
        itemName = "Laptop Gaming",
        basePrice = 15000000.0,
        customerType = "VIP",
        pricing = VipPricing()
    )

    // Customer Regular
    processor.processOrder(
        itemName = "Mouse Wireless",
        basePrice = 250000.0,
        customerType = "REGULAR",
        pricing = RegularPricing()
    )
}