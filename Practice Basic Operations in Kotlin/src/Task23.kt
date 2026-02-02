fun main() {
    val book = Book("Hamlet", "William Shakespeare", 1603)
    val (title, author, year) = book.getTitleAuthorYear()

    println("Here is your book $title written by $author in $year")
}

class Book(val title: String, val author: String, val year: Int) {

    fun getTitleAuthor(): Pair<String, String> {
        return title to author
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}