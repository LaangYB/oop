package week03

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    println("WARNING: Damage tidak boleh negatif! Nilai tidak diubah.")
                }
                value > 1000 -> {
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}
fun main() {

    // ===== TEST WEAPON =====
    val weapon = Weapon("Excalibur")

    weapon.damage = -50
    println("Damage sekarang: ${weapon.damage}")

    weapon.damage = 9999
    println("Damage sekarang: ${weapon.damage}")

    println("Tier senjata: ${weapon.tier}")


    println("\n====================\n")


    // ===== TEST PLAYER =====
    val player = Player("Budi")

    // ❌ Ini harus error kalau di-uncomment
    // println(player.xp)

    player.addXp(50)   // masih level 1
    player.addXp(60)   // harus naik ke level 2

    println("Level saat ini: ${player.level}")
}