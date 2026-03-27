package oop_135062_dianfajrina.week07

fun main() {
    println("\n=== TUGAS MANDIRI: RPG GAME ===")

    // 1. Test Singleton GameManager
    println("\n--- Game Manager ---")
    GameManager.startGame()
    GameManager.startGame() // buktikan singleton

    // 2. Cetak drop chance LEGENDARY
    println("\n--- Item Rarity Drop Chance ---")
    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    // 3. Factory Weapon
    println("\n--- Factory Weapon ---")
    val starterSword = Weapon.forgeStarterSword()
    println("Senjata awal: $starterSword")

    val epicSword = Weapon.forgeEpicSword()
    println("Senjata epic: $epicSword")

    // 4. Upgrade senjata menggunakan copy()
    println("\n--- Upgrade Senjata ---")
    val upgradedItem = starterSword.item.copy(damage = 25, name = "Pedang Kayu Upgrade")
    val upgradedWeapon = Weapon.create(upgradedItem, starterSword.durability)   // gunakan create
    println("Senjata setelah upgrade: $upgradedWeapon")

    // 5. Simulasi event berurutan
    println("\n--- Event Battle ---")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}