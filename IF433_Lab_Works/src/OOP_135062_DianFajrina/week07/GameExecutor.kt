package oop_135062_dianfajrina.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}! Bersiaplah bertarung!")
        }
        is BattleState.LootDropped -> {
            val item = event.item
            println("Mendapatkan loot: ${item.name} (${item.rarity}) - Damage: ${item.damage}")
        }
        is BattleState.GameOver -> {
            println("GAME OVER: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Anda berada di Safe Zone. Istirahat sejenak.")
        }
    }
}