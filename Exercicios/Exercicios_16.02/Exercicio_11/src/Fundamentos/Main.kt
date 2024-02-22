package Fundamentos

fun main(args: Array<String>) {
    val nota = 9
    // Usando operador range
    if (nota in 9..10) {
        println("fantástico")
    } else if (nota in 7..8) {
        println("Parabèns")
    } else if (nota in 4..6) {
        println("Tem como recuperar")
    } else if (nota in 0..3) {
        println("Te vejo no próximo ano")
    } else {
        println("Nota inválida")
    }
}
