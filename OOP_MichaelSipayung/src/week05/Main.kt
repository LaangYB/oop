package week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // 1. Panggil fungsi umum dari parent
        pegawai.bekerja()

        // 2. Blok 'when' harus di dalam 'for' agar bisa mengecek tiap pegawai
        when (pegawai) {
            is Dosen -> {
                // Kotlin melakukan Smart Cast, sehingga kita bisa akses properti 'nidn'
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------")
    }
    val helper = MathHelper()

    println("=== PENGUJIAN MATH HELPER (OVERLOADING) ===")

    // 1. Memanggil hitungLuas dengan satu parameter Int (Persegi)
    val luasPersegi = helper.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")

    // 2. Memanggil hitungLuas dengan dua parameter Int (Persegi Panjang)
    val luasPersegiPanjang = helper.hitungLuas(10, 4)
    println("Luas Persegi Panjang (10x4): $luasPersegiPanjang")

    // 3. Memanggil hitungLuas dengan satu parameter Double (Lingkaran)
    val luasLingkaran = helper.hitungLuas(7.0)
    println("Luas Lingkaran (jari-jari 7.0): $luasLingkaran")

    val myWallet = EWallet(accountName = "Dana User", balance = 50000.0)
    val myCard = CreditCard(accountName = "Platinum Card", limit = 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(myWallet, myCard)

    println("=== SIMULASI TRANSAKSI E-COMMERCE ===")

    for (metode in daftarPembayaran) {
        println("Akun: ${metode.accountName}")
        metode.processPayment(75000.0)

        // --- SMART CASTING CHALLENGE ---
        if (metode is EWallet) {
            println("\n[Sistem] Mendeteksi E-Wallet. Mencoba Top Up otomatis...")

            // Kotlin otomatis mengenali 'metode' sebagai EWallet di sini
            metode.topUp(50000.0)

            println("[Sistem] Mencoba pembayaran ulang...")
            metode.processPayment(75000.0)
        }

        println("------------------------------------\n")
    }
}