package oop_135062_dianfajrina.week8

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)
            if (product != null) {
                // Cetak detail produk sesuai permintaan
                when (product) {
                    is Electronic -> {
                        val warrantyInfo = if (raw["warranty"] is Int) "Warranty ${product.warrantyMonths}" else "Fallback Warranty ${product.warrantyMonths}"
                        println("${product.name} ($warrantyInfo)")
                    }
                    is Clothing -> {
                        println("${product.name} (Size ${product.size})")
                    }
                }
                // Lanjutkan checkout (opsional, tapi tetap dijalankan)
                parser.checkout(product)
            }
            // Jika product null (misal tipe FOOD), tidak dicetak apa-apa (skip)
        } catch (e: IllegalArgumentException) {
            // Hanya Ghost Item yang menyebabkan exception di sini
            println("Exception ditangkap untuk \"Ghost Item\"")
        }
    }
}