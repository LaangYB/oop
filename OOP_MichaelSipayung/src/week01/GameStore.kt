package week01

fun main() {
    val gameTitle = "Black Myth: Wukong"
    val price = 700000

    val userNote: String? = null

    val discount = calculateDiscount(price = price)
    val finalPrice = price - discount


    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("=== SteamKW Game Receipt ===")
    println("Judul Game  : $title")
    println("Harga Akhir : Rp $finalPrice")


    println("Catatan     : ${note ?: "Tidak ada catatan"}")

    println("============================")
}