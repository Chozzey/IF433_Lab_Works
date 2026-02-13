package oop_135062_dianfajrina.week2

class Student(
    val name: String,
    val nim: String,
    val major: String
) {

    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memori.")
        }
    }

    // Secondary Constructor (Langkah 4)
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa jurusan).")
    }
}
