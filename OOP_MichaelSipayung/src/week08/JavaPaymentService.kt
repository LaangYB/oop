package week08

object JavaPaymentService {

    fun processPayment(productId: String): String {
        return "TRX-" + productId + "-SUCCESS"
    }
}