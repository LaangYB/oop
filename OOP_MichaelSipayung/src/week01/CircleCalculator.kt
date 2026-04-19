package week01

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius
    println("Radius: $radius, Area: $area")

    // Memanggil fungsi di dalam println sesuai instruksi
    println(checkSize(area))
}

// Menggunakan Expression Body dan 'if' sebagai expression
fun checkSize(area: Double) = if (area > 100) "This is a Big circle" else "This is a Small circle"