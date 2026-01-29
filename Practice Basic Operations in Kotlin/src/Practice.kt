fun main() {
    println("--- Registro de Ejercicios ---")

    val isHeavyWeight = { weight: Int -> weight >= 100 }

    logExercise("Bench Press", 80)

    logExercise("Squat", 120, sets = 5, reps = 5)

    println("¿Es la sentadilla pesada? ${isHeavyWeight(120)}")


    println("\n--- Ejecutando Rutina ---")

    val todaysRoutine = listOf("Deadlift", "Military Press", "Barbell Row")

    executeRoutine(todaysRoutine) { exerciseName ->
        println("Focusing on technique for: $exerciseName")
        println("-> Descansar 2 minutos.")
    }
}

fun logExercise(name: String, weight: Int, sets: Int = 3, reps: Int = 10) {
    val totalVolume = weight * sets * reps
    println("Logged: $name | $weight kg | $sets x $reps | Volumen Total: $totalVolume kg")
}

fun executeRoutine(exercises: List<String>, action: (String) -> Unit) {
    for (exercise in exercises) {
        action(exercise)
    }
    println("¡Entrenamiento completado!")
}