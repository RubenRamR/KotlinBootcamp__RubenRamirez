fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))

    println(whatShouldIDoToday("happy", weather = "rainy"))

    println(whatShouldIDoToday("sad"))

    print("How is your mood today? ")

    val mood = readLine()!!

    println(whatShouldIDoToday(mood))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read."
    }
}

fun isHappySunny(mood: String, weather: String) =
    mood == "happy" && weather == "sunny"

fun isSadRainyCold(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun isVeryHot(temperature: Int) =
    temperature > 35