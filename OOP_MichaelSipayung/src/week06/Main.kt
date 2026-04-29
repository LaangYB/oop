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

    val myHub = SmartHomeHub()
    val lampuRuangTamu = SmartLamp("L-001", "Lampu Ruang Tamu")
    val speakerGoogle = SmartSpeaker("S-001", "Google Nest Hub")
    val kameraTeras = SmartCCTV("C-001", "Tapo Camera Outdoor")
    val kameraDapur = SmartCCTV("C-002", "Ezviz Indoor")

    println("=== PROSES PENDAFTARAN PERANGKAT ===")
    myHub.addDevice(lampuRuangTamu)
    myHub.addDevice(speakerGoogle)
    myHub.addDevice(kameraTeras)
    myHub.addDevice(kameraDapur)

    println("\n=== MENGAKTIFKAN PERANGKAT ===")
    lampuRuangTamu.turnOn()
    speakerGoogle.turnOn()
    kameraTeras.turnOn()

    println("\n=== TES FITUR SPEAKER ===")
    speakerGoogle.playMusic("Bohemian Rhapsody")

    myHub.activateSecurityMode()
    myHub.turnOffAllSwitches()

    println("Simulasi Smart Home Selesai.")
}