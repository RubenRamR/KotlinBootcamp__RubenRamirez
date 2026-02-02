const val MAX_NUMBER_BOOKS = 5

fun main() {
    val book = Book("TheTurtleNovel")
    println(book.canBorrow(4))
    book.printUrl()
}

object Constants {
    const val BASE_URL = "http://www.turtlecare.net/"
}

class Book(val title: String) {
    fun canBorrow(userBooks: Int): Boolean {
        return userBooks < MAX_NUMBER_BOOKS
    }

    fun printUrl() {
        println(BASE_URL + title + ".html")
    }

    companion object {
        const val BASE_URL = "http://www.turtlecare.net/"
    }
}