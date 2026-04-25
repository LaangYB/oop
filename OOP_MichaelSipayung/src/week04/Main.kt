package week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Ontel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    // Perbaikan: Pastikan nama parameter sesuai dengan yang ada di class Car (numberOfDoors)
    val myCar = Car(brand = "Toyota",4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myEv = ElectricCar("Tesla Model 3", 4, 90)
    myEv.openTrunk()
    myEv.accelerate() // Ini akan mencetak "berakselerasi dalam sunyi"
    myEv.honk()

    println("\n--- Data Manager ---")
    // Perbaikan: Panggil 'Manager', bukan 'Manager.kt'
    val manager = Manager("Budi", 10000000)
    manager.work()
    // Mencetak bonus: (10% * 10jt) + 500rb = 1.500.000
    println("Bonus ${manager.name}: Rp ${manager.calculateBonus()}")

    println("\n--- Data Developer ---")
    // 2. Instansiasi objek Developer
    val developer = Developer("Andi", 8000000, "Kotlin")
    developer.work()
    // Mencetak bonus: (10% * 8jt) = 800.000 (menggunakan logika Employee)
    println("Bonus ${developer.name}: Rp ${developer.calculateBonus()}")
}