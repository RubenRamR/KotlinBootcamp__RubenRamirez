fun main() {
    val numbers = arrayOf(11, 12, 13, 14, 15)

    val stringList = mutableListOf<String>()

    for (number in numbers) {
        stringList.add(number.toString())
    }

    println("Lista de strings: $stringList\n------------")


    val divisibleBy7 = mutableListOf<Int>()

    for (i in 0..100 step 7) {
        divisibleBy7.add(i)
    }

    println("Divisibles por 7: $divisibleBy7")
}