fun main() {
    val curry = Curry("Indian Curry", "very spicy")
    val spiceContainer = SpiceContainer(curry)

    println("Spice: ${curry.name}")
    println("Color: ${curry.color}")
    println("Container Label: ${spiceContainer.label}")

    curry.grind()
    curry.prepareSpice()
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00)
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

interface Grinder {
    fun grind()
}

sealed class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) :
    Spice(name, spiciness, color), Grinder {

    override fun grind() {
        println("Grinding $name")
    }

    override fun prepareSpice() {
        println("Making $name")
    }
}

data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}