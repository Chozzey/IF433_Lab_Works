package oop_135062_dianfajrina.week14

class UserValidator {
    fun validator(user: User): Boolean = user.email.contains("@") && user.age >= 18
}

class UserRepository {
    fun save(user: User) {
        println("Saving user ${user.name} to Database")
    }
}