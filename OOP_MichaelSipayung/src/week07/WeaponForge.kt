package week07

class Weapon private constructor(
    val item: GameItem,
    val durability: Int
) {
    companion object {

        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem(
                name = "Pedang Kayu Bapuk",
                damage = 5,
                rarity = ItemRarity.COMMON
            )
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem(
                name = "Nightfall Slayer",
                damage = 85,
                rarity = ItemRarity.EPIC
            )
            return Weapon(epicItem, 150)
        }
    }

    fun displayInfo() {
        println("Weapon: ${item.name} | Damage: ${item.damage} | Rarity: ${item.rarity} | Durability: $durability")
    }
}