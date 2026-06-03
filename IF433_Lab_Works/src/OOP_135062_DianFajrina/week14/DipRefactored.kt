package oop_135062_dianfajrina.week14

interface Databse {
    fun query(sql: String): List<String>
}

class PostgresDatabase : Database {
    override fun query(sql: String): ListOf("pg_data1", "pg_data2")
}

class SafeUserService(private val db: Database) {
    fun getUser(id: Int) = db.query("SELECT * FROM users WHERE id = $id")
}