package week03

class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            field = if (value < 0) 0 else value
        }

    private var performanceRating: Int = 3

    fun increasePerformanceRating() {
        performanceRating++
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }

    val tax: Double
        get() = salary * 0.1
}