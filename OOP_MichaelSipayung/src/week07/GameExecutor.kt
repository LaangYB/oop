package week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("[PERTEMPURAN] Seekor ${event.monsterName} menghadang jalanmu! Siapkan senjatamu!")
        }
        is BattleState.LootDropped -> {
            val (itemName, _, itemRarity) = event.item
            println("[LOOT] Beruntung sekali! Kamu mendapatkan item [$itemName] dengan kelangkaan ${itemRarity.name} (Peluang drop: ${itemRarity.dropChance}%)")
        }
        BattleState.SafeZone -> {
            println("[INFO] Kamu berada di Zona Aman. HP dan Mana telah dipulihkan.")
        }
        is BattleState.GameOver -> {
            println("[GAME OVER] Petualangan terhenti karena: ${event.reason}")
            GameManager.isGameRunning = false
        }
    }
}