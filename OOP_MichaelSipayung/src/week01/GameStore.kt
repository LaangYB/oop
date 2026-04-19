package week01

fun main() {
    val gameTitle = "Black Myth: Wukong"
    val price = 700000

    val finalPrice = calculateFinalPrice(originalPrice = price)

    println("=== SteamKW Game Receipt ===")
    println("Judul Game  : $gameTitle")
    println("Harga Asli  : Rp $price")
    println("Harga Akhir : Rp ${finalPrice.toInt()}")
    println("============================")
}

fun calculateFinalPrice(originalPrice: Int): Double {
    val discount = if (originalPrice > 500000) 0.20 else 0.10
    return originalPrice * (1 - discount)
}