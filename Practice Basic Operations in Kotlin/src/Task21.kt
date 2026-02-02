fun main() {
    val curry = Curry("Indian Curry", "very spicy")
    println("Spice: ${curry.name}, Color: ${curry.color}, Heat: ${curry.heat}")
    curry.grind()
    curry.prepareSpice()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "Yellow"
}

interface Grinder {
    fun grind()
}

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 20
            else -> 0
        }

    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) :
    Spice(name, spiciness, color), Grinder {

    override fun grind() {
        println("Grinding $name into powder")
    }

    override fun prepareSpice() {
        println("Making $name")
    }
}