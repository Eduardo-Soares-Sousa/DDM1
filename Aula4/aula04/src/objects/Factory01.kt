package objects

class User {
    val username: String

    constructor(email: String) {
        this.username = email.substringBefore("@")
    }

    constructor(id: Int) {
        this.username = getUsernameFor(id)
    }

    private fun getUsernameFor(id: Int): String {
        return "Joe"
    }

    companion object {
        fun fromEmail(email: String) = User(email)
        fun newFromEmail(id: Int) = User(id)
    }
}

fun main() {
    val user1 = User("john.rambo@domain.com")
    val user2 = User(32)
}