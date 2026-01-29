fun main (args: Array<String>) {
    val timeInput = if (args.isNotEmpty()) args[0] else "15"

    val time = timeInput.toInt()

    if (time < 12) {
        println("Good morning, Kotlin")
    } else {
        println("Good night, Kotlin")
    }
}