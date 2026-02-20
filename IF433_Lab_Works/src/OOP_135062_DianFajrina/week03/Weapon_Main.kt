package oop_135062_dianfajrina.week03

fun main() {
    println("\n=== TEST WEAPON ===")
    val sword = Weapon("Excalibur", 300)

    sword.damage = -50      // harus gagal
    sword.damage = 9999     // harus jadi 1000

    println("Nama Weapon: ${sword.name}")
    println("Damage: ${sword.damage}")
    println("Tier: ${sword.tier}")
}