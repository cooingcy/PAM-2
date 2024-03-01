fun calcAreaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double{
    return ((baseMaior + baseMenor) * altura) / 2
}

fun main(args: Array<String>) {
    val baseMaior = 10.0
    val baseMenor = 6.0
    val altura = 4.0
    val areaTrapezio = calcAreaTrapezio(baseMaior, baseMenor, altura)
    println("A Área do trapézio é: $areaTrapezio")
}