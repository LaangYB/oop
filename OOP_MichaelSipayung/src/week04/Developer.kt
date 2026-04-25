package week04

// Developer mewarisi Employee dan menambah parameter programmingLanguage
class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguage: String
) : Employee(name, baseSalary) {

    // Override work untuk menampilkan bahasa pemrograman yang digunakan
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

    // calculateBonus tidak ditulis di sini karena
    // secara otomatis menggunakan implementasi dari Parent (Employee)
}