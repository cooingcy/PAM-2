import kotlin.math.PI

fun calcAreaCircunferencia(raio: Double): Double{
    return PI * raio * raio
}

fun main(args: Array<String>) {
    val raioCircunferencia = 5.0
    val areaCircunferencia = calcAreaCircunferencia(raioCircunferencia)
    println("Área da Circunferência é: $areaCircunferencia")
}