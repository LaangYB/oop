package week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    // Kita butuh input Nama dan NIM dulu sebelum pilih jalur
    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (5 Karakter): ")
    val nim = scanner.next()
    scanner.nextLine() // Clear buffer

    if (nim.length != 5) {
        println("Error: NIM harus 5 karakter!")
        return // Berhenti jika NIM salah
    }

    println("\nPilih jalur pendaftaran:")
    println("1. Reguler (Pilih Jurusan)")
    println("2. Umum (Tanpa Jurusan / Non-Matriculated)")
    print("Pilihan: ")
    val type = scanner.nextInt()
    scanner.nextLine() // Clear buffer

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // Memanggil Primary Constructor
        val s1 = Student(name = name, nim = nim, major = major)
        println("Status: Berhasil daftar dijalur Reguler.")
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

    } else if (type == 2) {
        // Memanggil Secondary Constructor (jalur umum)
        val s1 = Student(name, nim)
        println("Status: Berhasil daftar dijalur Umum.")
        println("Terdaftar sebagai: ${s1.major} dengan GPA awal ${s1.gpa}")

    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }
}