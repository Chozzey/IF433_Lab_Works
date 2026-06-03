package oop_135062_dianfajrina.week14

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(): Printable
}

class ModernSimplePrinter : Printable {
    override fun print(doc: String) = println("Printing securely: $doc")
}