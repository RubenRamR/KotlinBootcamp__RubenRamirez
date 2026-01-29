fun main() {

    val rollDiceSimple = { (1..12).random() }

    val rollDice = { sides: Int ->
        if (sides == 0) 0
        else (1..sides).random()
    }

    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else (1..sides).random()
    }

    println("Tirada simple: ${rollDice(6)}")
    println("Tirada con tipo explícito: ${rollDice2(12)}")
    println("Tirada con 0 lados: ${rollDice2(0)}")


}
