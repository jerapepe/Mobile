const val PI = 3.1416

fun main( ) {
    val num1 = 34.3341
    val tipo = num1::class
    println (tipo)
    val num2: Double = 8.6535
    val num3: Float = num2.toFloat()
    println("Numero Double: $num2")
    println("Numero Float: $num3")

    val decimal= 3.2584f
    val  resultado= 2 * PI * decimal

    println("El perímetro del círculo es: $resultado")
}