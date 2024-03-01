fun calcAreaLosango(diagonalMaior: Double, diagonalMenor: Double): Double{
    return (diagonalMaior * diagonalMenor) / 2
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    val diagonalMaior = 8.0
    val diagonalMenor = 6.0
    val areaLosango = calcAreaLosango(diagonalMaior, diagonalMenor)
    println("A Área do Losango é: $areaLosango")
}