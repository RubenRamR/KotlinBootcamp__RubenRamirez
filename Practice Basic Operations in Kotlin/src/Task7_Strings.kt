fun main(){
    val fishName = "Nemo"

    when (fishName.length) {
        0 -> println("El nombre no puede estar vacío.")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }
}