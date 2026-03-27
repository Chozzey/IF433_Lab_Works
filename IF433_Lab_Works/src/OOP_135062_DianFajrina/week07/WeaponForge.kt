package oop_135062_dianfajrina.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(item, 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem("Pedang Naga", 50, ItemRarity.EPIC)
            return Weapon(item, 100)
        }
    }

    override fun toString(): String {
        return "Weapon(item=$item, durability=$durability)"
    }
}