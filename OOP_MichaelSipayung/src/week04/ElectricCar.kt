package week04

class ElectricCar(
    brand: String,
    numberOfDoors: Int,
    val batteryCapacity: Int
) : Car(brand, numberOfDoors) {

    final override fun accelerate() {
        // Implementasi murni tanpa memanggil super.accelerate()
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}