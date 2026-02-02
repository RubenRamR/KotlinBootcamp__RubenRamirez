import kotlin.math.absoluteValue

fun main() {
    val game = Game()
    while (true) {
        print("Enter a direction: n/s/e/w: ")
        game.makeMove(readLine())
    }
}

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path = mutableListOf(Directions.START)
    val myLocation = Location()

    val north = { path.add(Directions.NORTH); true }
    val south = { path.add(Directions.SOUTH); true }
    val east = { path.add(Directions.EAST); true }
    val west = { path.add(Directions.WEST); true }

    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    fun move(where: () -> Boolean) {
        if (where()) {
            updateLocation()
        }
    }

    fun makeMove(direction: String?) {
        when (direction) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }

    fun updateLocation() {
        val lastMove = path.last()
        when (lastMove) {
            Directions.NORTH -> myLocation.y = (myLocation.y - 1 + myLocation.height).rem(myLocation.height)
            Directions.SOUTH -> myLocation.y = (myLocation.y + 1).rem(myLocation.height)
            Directions.EAST -> myLocation.x = (myLocation.x + 1).rem(myLocation.width)
            Directions.WEST -> myLocation.x = (myLocation.x - 1 + myLocation.width).rem(myLocation.width)
            else -> { }
        }
        println(myLocation.map[myLocation.x][myLocation.y])
    }
}

class Location(val width: Int = 4, val height: Int = 4) {
    val map = Array(width) { arrayOfNulls<String>(height) }
    var x = 0
    var y = 0

    init {
        for (i in 0 until width) {
            for (j in 0 until height) {
                map[i][j] = "Room ($i, $j)"
            }
        }
    }
}