package oop_135062_dianfajrina.week05

class Dosen(nama: Sting, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS")
    }

    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas")
    }
}