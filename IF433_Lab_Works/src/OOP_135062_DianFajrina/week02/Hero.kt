package oop_135062_dianfajrina.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100   // Default HP = 100
) {

    // Method menyerang
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    // Method menerima damage
    fun takeDamage(damage: Int) {
        hp -= damage

        // HP tidak boleh minus
        if (hp < 0) {
            hp = 0
        }
    }

    // Cek apakah hero masih hidup
    fun isAlive(): Boolean {
        return hp > 0
    }
}