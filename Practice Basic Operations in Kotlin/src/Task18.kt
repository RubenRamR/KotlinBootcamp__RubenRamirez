fun main() {
    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "very spicy")
    )

    val filteredSpices = spices.filter { it.heat <= 5 }

    makeSalt()
}

class Spice(val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                "medium" -> 7
                "spicy" -> 10
                "very spicy" -> 20
                else -> 0
            }
        }

    init {
        println("Name: $name, Spiciness: $spiciness, Heat: $heat")
    }
}

fun makeSalt() = Spice("Salt")