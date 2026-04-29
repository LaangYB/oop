package week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu [$name] dengan ID ($id) sekarang menyala. Menyesuaikan kecerahan...")
    }

    override fun turnOff() {
        println("Lampu [$name] dengan ID ($id) telah dimatikan.")
    }
}