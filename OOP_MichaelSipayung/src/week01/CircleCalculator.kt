package week01

fun main(args: Array<String>) {
    // Langkah 2: Menggunakan val dan Type Inference
    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    // Menggunakan String Template
    println("Radius: $radius, Area: $area")

    // Logic check
    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big circle")
    } else {
        println("This is a Small circle")
    }
}