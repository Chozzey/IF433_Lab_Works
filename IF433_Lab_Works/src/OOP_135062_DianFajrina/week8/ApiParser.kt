package oop_135062_dianfajrina.week8

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Ekstrak id dan name. Gunakan requireNotNull dengan pesan error custom
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" } as? String
            ?: throw IllegalArgumentException("ID must be String")
        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing name" } as? String
            ?: throw IllegalArgumentException("Name must be String")
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = (rawJson["warranty"] as? Int) ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = (rawJson["size"] as? String) ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) {
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }
        // Karena kita yakin Java service selalu berhasil, gunakan !!
        val transactionId = JavaPaymentService.processPayment(id)!!
        println("Transaction ID: $transactionId")
    }
}