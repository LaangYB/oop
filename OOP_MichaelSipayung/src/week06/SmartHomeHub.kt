package week06

class SmartHomeHub {

    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Sistem: Perangkat [${device.name}] berhasil ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n--- Memulai Prosedur Shutdown Massal ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            } else {
                println("Sistem: [${device.name}] tidak memiliki saklar daya (Dilewati).")
            }
        }
        println("--- Prosedur Selesai ---\n")
    }

    // Tambahkan fungsi activateSecurityMode di sini
    fun activateSecurityMode() {
        println("\n--- MENGAKTIFKAN MODE KEAMANAN ---")
        for (device in devices) {
            // Cek apakah perangkat bisa merekam (Recordable)
            if (device is Recordable) {
                device.startRecord()
            }

            // Cek apakah perangkat adalah SmartSpeaker untuk membunyikan sirine
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
        println("--- MODE KEAMANAN AKTIF ---\n")
    }
}