package week06

/**
 * File: SmartSpeaker.kt
 * Implementasi perangkat Smart Speaker (seperti Google Nest).
 */

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Smart Speaker [$name] aktif. Menunggu perintah suara...")
    }

    override fun turnOff() {
        println("Smart Speaker [$name] masuk ke mode standby.")
    }

    /**
     * Fungsi spesifik untuk perangkat speaker
     */
    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify di perangkat $name.")
    }
}