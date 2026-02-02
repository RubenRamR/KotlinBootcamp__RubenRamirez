import kotlin.random.Random

fun main() {
    val book = Book("Harry Potter", "J.K. Rowling", 300)
    val puppy = Puppy()

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("Pages left: ${book.pages}")
    }
}

class Book(val title: String, val author: String, var pages: Int)

fun Book.weight(): Double {
    return pages * 1.5
}

fun Book.tornPages(torn: Int) {
    if (pages >= torn) pages -= torn else pages = 0
}

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random.nextInt(1, 20))
    }
}