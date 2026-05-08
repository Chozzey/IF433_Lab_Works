package oop_135062_dianfajrina.week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
    
    fun findByName(query: String): List<T> {
        return items.filter { item ->
            item.toString().contains(query, ignoreCase = true)
        }
    }
}