import kotlin.math.sqrt

fun calcAreaTriangulo(base: Double, altura: Double): Double{
    return (base * altura) / 2
}

fun calcAreaTringuloEq(lado: Double): Double{
    return (sqrt(3.0) / 4) * lado * lado
}

fun calcAreaTrianguloIso(base: Double, lado: Double): Double{
    val altura = sqrt(lado * lado - (base * base) / 4)
    return (base * altura) / 2
}

fun calcAreaTrianguloEsc(lado1: Double, lado2: Double, lado3: Double): Double{
    val semiperimetro = (lado1 + lado2 + lado3) / 2
    return sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3))
}

fun main(args: Array<String>) {
    //Área Triângulo
        val base = 4.0
        val altura = 6.0
        val areatriangulo = calcAreaTriangulo(base, altura)
        println("A Área do Triângulo é: $areatriangulo")

    //Área Triângulo Equilátero
        val ladoTriEq = 5.0
        val areaTriEq = calcAreaTringuloEq(ladoTriEq)
        println("A Área do Triângulo Equilátero é: $areaTriEq")

    //Área Triângulo Isósceles
        val baseTriIso = 4.0
        val ladoTriIso = 6.0
        val areaTriIso = calcAreaTrianguloIso(baseTriIso, ladoTriIso)
        println("A Área do Triângulo Isósceles é: $areaTriIso")

    //Área Triângulo Escaleno
        val lado1TriEsc = 3.0
        val lado2TriEsc = 4.0
        val lado3TriEsc = 5.0
        val areaTriEsc = calcAreaTrianguloEsc(lado1TriEsc, lado2TriEsc, lado3TriEsc)
        println("A Área do Triângulo Escaleno é: $areaTriEsc")
}