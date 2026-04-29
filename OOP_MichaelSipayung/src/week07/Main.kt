package week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()
    println("Status Terbaru: ${DatabaseManager.connectionStatus}")

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 28)
    val reg2 = RegularUser("Alice", 28)
    println(reg1) // Akan mencetak alamat memori (hashcode)
    println("Sama? ${reg1 == reg2}") // False, karena referensi memori berbeda

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 28)
    val data2 = DataUser("Alice", 28)
    println(data1) // Akan mencetak konten: DataUser(name=Alice, age=28)
    println("Sama? ${data1 == data2}") // True, karena kontennya sama

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1 // Destructuring Declarations
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        is ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    val nextResponse: ApiResponse = ApiResponse.Success("Data User ditemukan!")
    println(when(nextResponse) {
        is ApiResponse.Success -> "Tampilkan: ${nextResponse.data}"
        is ApiResponse.Error -> "Munculkan alert: ${nextResponse.message}"
        is ApiResponse.Loading -> "Tampilkan Spinner"
    })
    println("\n=== MENGUJI SINGLETON GAME MANAGER ===")
    // Panggilan pertama: Game akan mulai
    GameManager.startGame()

    // Panggilan kedua: Akan tertahan oleh logika Singleton
    GameManager.startGame()

    println("\n=== SIMULASI PERJALANAN RPG ===")

    // 1. Membuat Senjata menggunakan Factory (Companion Object)
    val starterSword = Weapon.forgeStarterSword()
    val legendarySword = Weapon.forgeEpicSword()

    println("Senjata Baru Didapatkan:")
    starterSword.displayInfo()
    legendarySword.displayInfo()

    // 2. Daftar Event yang akan terjadi (Sealed Class)
    val journey = listOf(
        BattleState.SafeZone,
        BattleState.MonsterEncounter("Slime Hijau"),
        BattleState.MonsterEncounter("Ancient Dragon"),
        BattleState.LootDropped(GameItem("Cincin Keabadian", 0, ItemRarity.LEGENDARY)),
        BattleState.GameOver("Kelelahan Luar Biasa")
    )

    // 3. Eksekusi Event menggunakan Executor (Smart Casting & Destructuring)
    for (event in journey) {
        processEvent(event)
    }

    println("\n=== STATUS AKHIR ===")
    println("Apakah game masih berjalan? ${GameManager.isGameRunning}")

    println("\nSimulasi Week 07 Selesai.")
}