package week08

// Definisi sealed class sebagai parent
sealed class Product

// Turunan Electronic
data class Electronic(
    val id: String,
    val name: String,
    val warrantyMonths: Int
) : Product()

// Turunan Clothing
data class Clothing(
    val id: String,
    val name: String,
    val size: String
) : Product()