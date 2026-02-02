fun main() {
    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val library = mapOf("William Shakespeare" to allBooks)

    println(library.any { it.value.contains("Hamlet") })

    val moreBooks = mutableMapOf("Hamlet" to "William Shakespeare")
    moreBooks.getOrPut("Jungle Book") { "Rudyard Kipling" }

    println(moreBooks)
}