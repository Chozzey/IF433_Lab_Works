package oop_135062_dianfajrina.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    // test
    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}