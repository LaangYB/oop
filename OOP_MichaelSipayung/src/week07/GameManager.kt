package week07

object GameManager {

    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        } else {
            isGameRunning = true
            println("Memulai Game Engine... Selamat datang di dunia RPG!")
        }
    }

    fun stopGame() {
        isGameRunning = false
        println("Game Engine dihentikan.")
    }
}