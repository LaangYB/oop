package week08

fun main(){
    println("=== TEST LET BLOCK ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota " +
    "tidak diketahui"
    println("Tujuan pengiriman: $destination")

    println("=== TEST LET BLOCK ===")
    val validOrder = Order(null, 2500000)
    val receipt = validOrder.totalPrice?.let { price ->

        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        45000000.0
    )

    for (item in mixedData) {
        val text = item as? String

        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }
    val someObject: Any = 100

    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast + fallback: $safeString")

    println("\n=== TEST THE RED BUTTON (!!) ===")
    val toxicData: String? = null
    try {
        val length = toxicData!!.length
    } catch (e: NullPointerException) {
        println("CRASH (NPE)! Jangan Gunakan !! secara sembarangan.")
    }
}