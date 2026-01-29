fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    val curriesSorted = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println("Curries ordenados: $curriesSorted")

    val ceFilter1 = spices.filter { it.startsWith('c') }.filter { it.endsWith('e') }

    val ceFilter2 = spices.filter { it.startsWith('c') && it.endsWith('e') }

    println("Empiezan con 'c' y terminan con 'e': $ceFilter1")

    val firstThreeC = spices.take(3).filter { it.startsWith('c') }

    println("Primeros 3 que empiezan con 'c': $firstThreeC")
}