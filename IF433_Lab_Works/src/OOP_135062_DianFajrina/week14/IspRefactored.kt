package oop_135062_dianfajrina.week14

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(): Printable
}