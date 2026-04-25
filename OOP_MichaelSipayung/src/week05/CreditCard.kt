package week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    // Properti untuk melacak berapa banyak limit yang sudah terpakai
    var usedAmount: Double = 0.0

    // Mengimplementasikan logika pembayaran kartu kredit
    override fun processPayment(amount: Double) {
        println("--- Memproses Pembayaran Kartu Kredit ---")

        // Cek apakah total penggunaan setelah transaksi ini masih di bawah limit
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            val remainingLimit = limit - usedAmount
            println("Transaksi sebesar Rp $amount berhasil.")
            println("Total tagihan $accountName saat ini: Rp $usedAmount")
            println("Sisa limit tersedia: Rp $remainingLimit")
        } else {
            println("Transaksi ditolak! Pembayaran sebesar Rp $amount melebihi limit kartu $accountName.")
        }
    }
}