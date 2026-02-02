fun main() {
    val simpleSpice = SimpleSpice()
    println("Name: ${simpleSpice.name}, Heat: ${simpleSpice.heat}")
}

class SimpleSpice {
    val name = "curry"
    val spiciness = "mild"
    val heat: Int
        get() {
            return 5
        }
}