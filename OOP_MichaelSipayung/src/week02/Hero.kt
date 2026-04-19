package week02

class Hero(
    val name: String,
    var baseDamage: Int,
    var hp: Int = 100 // default argument
) {

    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage

        // Pastikan HP tidak kurang dari 0
        if (hp < 0) {
            hp = 0
        }

        println("$name menerima $damage damage. Sisa HP: $hp")
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    // 1. Input nama Hero & damage
    print("Masukkan nama Hero: ")
    val name = readLine() ?: "Hero"

    print("Masukkan base damage: ")
    val damage = readLine()?.toIntOrNull() ?: 10

    val hero = Hero(name, damage)

    // 2. Enemy cukup variabel
    var enemyHp = 100

    println("\n=== Pertarungan Dimulai ===")
    println("${hero.name} vs Enemy (HP: $enemyHp)\n")

    // 3. Main loop
    while (hero.isAlive() && enemyHp > 0) {
        println("\nPilih aksi:")
        println("1. Serang")
        println("2. Kabur")
        print(">> ")

        when (readLine()) {
            "1" -> {
                // Hero menyerang
                hero.attack("Enemy")
                enemyHp -= hero.baseDamage

                if (enemyHp < 0) enemyHp = 0
                println("HP Enemy sekarang: $enemyHp")

                // Jika musuh masih hidup, balas
                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Enemy menyerang balik!")
                    hero.takeDamage(enemyDamage)
                }
            }

            "2" -> {
                println("${hero.name} kabur dari pertarungan!")
                break
            }

            else -> println("Pilihan tidak valid!")
        }
    }

    // 4. Hasil akhir
    println("\n=== Hasil Pertarungan ===")
    when {
        hero.isAlive() && enemyHp == 0 -> println("${hero.name} MENANG!")
        !hero.isAlive() && enemyHp > 0 -> println("Enemy MENANG!")
        else -> println("Pertarungan berakhir tanpa pemenang.")
    }
}