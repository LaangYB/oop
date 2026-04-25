package week05

// Menggunakan keyword abstract agar class ini tidak bisa diinstansiasi langsung
abstract class PaymentMethod(val accountName: String) {

    // Abstract function: tidak punya isi/body
    // Wajib di-override oleh class turunan (seperti CreditCard atau EWallet)
    abstract fun processPayment(amount: Double)
}