package week06

class Smartwatch : Watch(), BluetoothConectable, Rechargeable {
    override fun showTime() {
        println("Layar 0LED menyala : 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}