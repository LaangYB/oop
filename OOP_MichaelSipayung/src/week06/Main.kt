package week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai Checkout...")
    method.pay(amount)
}

fun main() {
    // --- Bagian Gadget & Payment (Tugas Sebelumnya) ---
    val myWatch = Smartwatch() // Pastikan nama class sesuai, biasanya 'Watch' atau 'Smartwatch'
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    // --- Bagian Smart Home (Tugas Mandiri Baru) ---
    val myHub = SmartHomeHub()

    // Instansiasi perangkat sesuai skenario
    val lampuRuangTamu = SmartLamp("L-001", "Lampu Ruang Tamu")
    val speakerGoogle = SmartSpeaker("S-001", "Google Nest Hub")
    val kameraTeras = SmartCCTV("C-001", "Tapo Camera Outdoor")
    val kameraDapur = SmartCCTV("C-002", "Ezviz Indoor")
    val kameraGarasi = SmartCCTV("C-003", "Ezviz Garasi")

    println("\n=== PROSES PENDAFTARAN PERANGKAT KE HUB ===")
    myHub.addDevice(lampuRuangTamu)
    myHub.addDevice(speakerGoogle)
    myHub.addDevice(kameraTeras)
    myHub.addDevice(kameraDapur)
    myHub.addDevice(kameraGarasi)

    println("\n=== MENGAKTIFKAN PERANGKAT SECARA INDIVIDUAL ===")
    lampuRuangTamu.turnOn()
    speakerGoogle.turnOn()
    // Saat turnOn() dipanggil, CCTV otomatis startRecord() karena logika di SmartCCTV.kt
    kameraTeras.turnOn()
    kameraGarasi.turnOn()

    println("\n=== TES FITUR SPEAKER ===")
    speakerGoogle.playMusic("Bohemian Rhapsody")

    // --- EKSEKUSI TUGAS MANDIRI UTAMA ---
    // 1. Mengaktifkan Mode Keamanan (CCTV Record & Speaker Sirine)
    myHub.activateSecurityMode()

    // 2. Mematikan semua perangkat yang memiliki saklar (Switchable)
    myHub.turnOffAllSwitches()

    println("\n[Sistem] Simulasi Smart Home Selesai.")
}