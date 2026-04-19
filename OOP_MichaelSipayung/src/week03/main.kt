package week03

fun main(){
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("gaji: ${e.salary}")

    e.increasePerformanceRating()

    println("pajak yang harus dibayar: ${e.tax}")
}