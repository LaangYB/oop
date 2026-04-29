package week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai Checkout...")
    method.pay(amount)
}
fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    val lampuKamar = SmartLamp("L001", "Lampu Kamar Utama")
    lampuKamar.turnOn()
    lampuKamar.turnOff()

    val mySpeaker = SmartSpeaker("SPK-001", "Google Nest Hub")

    mySpeaker.turnOn()
    mySpeaker.playMusic("Bohemian Rhapsody")
    mySpeaker.turnOff()
}