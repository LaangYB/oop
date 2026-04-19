package week03

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    println("WARNING: Damage tidak boleh negatif! Nilai tidak diubah.")
                    // tidak mengubah field (tetap nilai lama)
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
    val weapon = Weapon("Excalibur")

    // Test 1: Damage negatif (harus gagal)
    weapon.damage = -50
    println("Damage sekarang: ${weapon.damage}")

    // Test 2: Damage terlalu besar (harus jadi 1000)
    weapon.damage = 9999
    println("Damage sekarang: ${weapon.damage}")

    // Print tier
    println("Tier senjata: ${weapon.tier}")
}