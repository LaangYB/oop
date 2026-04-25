package week04

open class Car (brand: String, val numberofDoors: Int) : Vehicle(brand){
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberofDoors pinntu dibuka.")
    }

    override fun honk() {
       println("TIN TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan")
    }
}