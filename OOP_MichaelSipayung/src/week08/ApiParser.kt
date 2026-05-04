package week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // 1. Ekstrak id dan name dengan requireNotNull (Throws IllegalArgumentException jika null)
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" } as String
        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" } as String

        // 2. Ekstrak type
        val type = rawJson["type"] as? String

        // 3. Logika Parsing berdasarkan type
        return when (type) {
            "ELECTRONIC" -> {
                // Ekstrak warranty dengan as? dan Elvis fallback 12
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                // Ekstrak size dengan as? dan Elvis fallback "All Size"
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> {
                // Jika tipe selain itu atau null, return null
                null
            }
        }
    }


    fun checkout(product: Product) {
        // 1. Ekstrak ID menggunakan smart casting dari sealed class Product
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        // 2. Memanggil JavaPaymentService.
        // Penggunaan !! menandakan kita yakin Java tidak akan mengembalikan null.
        val transactionId = JavaPaymentService.processPayment(id)!!

        // 3. Output hasil transaksi
        println("Transaction successful: $transactionId")
    }
}