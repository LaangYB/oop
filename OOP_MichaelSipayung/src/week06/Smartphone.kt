package week06

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smaphone berhasil booting")
    }
}