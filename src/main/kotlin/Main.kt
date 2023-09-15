import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Calculadora en Kotlin")
    println("Ingrese el primer número:")
    val numero1 = scanner.nextDouble()

    println("Ingrese el segundo número:")
    val numero2 = scanner.nextDouble()

    println("Seleccione una operación:")
    println("1. Suma")
    println("2. Resta")
    println("3. Multiplicación")
    println("4. División")

    val opcion = scanner.nextInt()

    when (opcion) {
        1 -> println("Resultado: ${numero1 + numero2}")
        2 -> println("Resultado: ${numero1 - numero2}")
        3 -> println("Resultado: ${numero1 * numero2}")
        4 -> {
            if (numero2 != 0.0) {
                println("Resultado: ${numero1 / numero2}")
            } else {
                println("No se puede dividir por cero.")
            }
        }
        else -> println("Opción no válida")
    }

    scanner.close()
}
