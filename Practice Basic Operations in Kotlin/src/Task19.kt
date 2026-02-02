fun main() {
    val book = Book("The Great Gatsby", "F. Scott Fitzgerald")
    book.readPage()

    val ebook = eBook("1984", "George Orwell")
    ebook.readPage()
}

open class Book(val title: String, val author: String) {
    private var currentPage = 0

    open fun readPage() {
        currentPage++
    }
}

class eBook(title: String, author: String, var format: String = "text") : Book(title, author) {
    private var wordCount = 0

    override fun readPage() {
        wordCount += 250
    }
}