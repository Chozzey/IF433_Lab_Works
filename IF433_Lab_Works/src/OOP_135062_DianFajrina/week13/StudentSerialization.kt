package oop_135062_dianfajrina.week13
import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)

fun Student.toCvs(): String = "$name, $age, $gpa"

fun fromCsv(Line: String): Student {
    val parts = Line.split(",")
    return Student(parts[0], parts[1].toInt(), parts[2].toDouble())
}

fun saveStudent(student: List<Student>, path: String) {
    File(path).writeText(students.joinToString("\n") { it.toCsv() })
}

fun loadStudents(path: String): List<Student> {
    return try {
        File(path).readLines().map { fromCsv(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}