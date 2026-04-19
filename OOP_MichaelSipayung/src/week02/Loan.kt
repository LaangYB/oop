package week02

fun main() {
    // Contoh 1: Pinjam lebih dari 3 hari (Kena Denda)
    val loan1 = LibraryLoan(bookTitle = "Kotlin Programming", borrower = "John Thor", loanDuration = 5)

    // Contoh 2: Pinjam 1 hari (Default Argument - Tidak Kena Denda)
    val loan2 = LibraryLoan(bookTitle = "Clean Code", borrower = "Jane Doe")

    // Menampilkan Hasil
    println("=== Detail Pinjaman ===")
    println("Buku: ${loan1.bookTitle} | Peminjam: ${loan1.borrower} | Durasi: ${loan1.loanDuration} hari")
    println("Total Denda: Rp ${loan1.calculateFine()}")

    println("\nBuku: ${loan2.bookTitle} | Peminjam: ${loan2.borrower} | Durasi: ${loan2.loanDuration} hari")
    println("Total Denda: Rp ${loan2.calculateFine()}")
}

class LibraryLoan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1 // Langkah 2: Default Argument
) {
    // Langkah 3: Method dengan Expression Body
    fun calculateFine(): Int = if (loanDuration > 3) {
        (loanDuration - 3) * 2000
    } else {
        0
    }
}