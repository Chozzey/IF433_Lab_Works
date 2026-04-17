package oop_135062_dianfajrina.week8

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
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
}