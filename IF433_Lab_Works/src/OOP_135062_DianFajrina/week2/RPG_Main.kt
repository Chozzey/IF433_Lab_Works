package oop_135062_dianfajrina.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")

    // Input hero
    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)

    // Enemy hanya variabel biasa
    var enemyHp = 100

    // Loop battle
    while (hero.isAlive() && enemyHp > 0) {

        println("\nMenu:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()

        if (choice == 1) {

            // Hero menyerang
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            println("HP Enemy sekarang: $enemyHp")

            // Jika musuh masih hidup → balas
            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy membalas sebesar $enemyDamage damage!")
                hero.takeDamage(enemyDamage)
                println("HP Hero sekarang: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("Hero kabur dari pertempuran!")
            break
        }
    }

    // Hasil akhir
    println("\n=== HASIL PERTEMPURAN ===")
    if (hero.isAlive() && enemyHp <= 0) {
        println("${hero.name} MENANG!")
    } else if (!hero.isAlive()) {
        println("${hero.name} KALAH...")
    } else {
        println("Pertempuran dihentikan.")
    }
}
