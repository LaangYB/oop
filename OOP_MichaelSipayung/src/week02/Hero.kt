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
    val heroA = Hero("Knight", 20)
    val heroB = Hero("Orc", 15)

    heroA.attack(heroB.name)
    heroB.takeDamage(heroA.baseDamage)

    println("Apakah ${heroB.name} masih hidup? ${heroB.isAlive()}")
}