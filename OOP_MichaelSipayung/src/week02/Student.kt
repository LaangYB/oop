package week02

class Student( val name: String,  val nim: String,  val major: String){
    init {
        if (nim.length !=5) {
            println("warning: Object tercipta dengan NIM ($nim) yang tidak valid ")
            println("data Mahasiswa $name mungkin akan bermasalah di sistem")
        } else {
            println("LOG: Objek student $name berhasil dialokasikan di Memory.")
        }
    }
    constructor(name: String, nim: String) : this(name, nim, major = "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (tanpa Jurusan).")
    }
}