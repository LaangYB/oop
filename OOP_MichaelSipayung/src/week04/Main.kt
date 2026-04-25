package week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Ontel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberofDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    val myEv = ElectricCar("Tesla Model 3", 4,90)
    myEv.openTrunk()
    myEv.accelerate()
    myEv.honk()
}