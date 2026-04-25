package week04

open class Vehicle(val brand: String) {
    var speed: Int = 0

    // Fungsi untuk menambah kecepatan
    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    // Fungsi honk seharusnya berada di dalam class jika itu adalah kemampuan kendaraan
    open fun honk() {
        println("Beep! Beep!")
    }
}

fun main() {
    val mobil = Vehicle("Toyota")
    mobil.honk()
    mobil.accelerate()
}