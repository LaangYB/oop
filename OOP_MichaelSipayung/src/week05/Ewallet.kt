package week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    // Mengimplementasikan kontrak dari abstract class PaymentMethod
    override fun processPayment(amount: Double) {
        println("--- Memproses Pembayaran E-Wallet ---")
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran sebesar Rp $amount berhasil.")
            println("Sisa saldo $accountName: Rp $balance")
        } else {
            println("Maaf $accountName, saldo tidak cukup untuk transaksi ini.")
        }
    }

    // Fungsi unik yang hanya dimiliki oleh EWallet
    fun topUp(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Top up berhasil! Saldo baru $accountName: Rp $balance")
        } else {
            println("Jumlah top up harus lebih dari 0.")
        }
    }
}