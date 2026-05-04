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
}