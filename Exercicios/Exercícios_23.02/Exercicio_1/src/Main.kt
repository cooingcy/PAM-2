//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun calcAreaRet(base: Double, altura: Double): Double{
    return base * altura

}

fun main(args: Array<String>) {
    val base = 5.0
    val altura = 8.0
    println("A área do retângulo é: ${calcAreaRet(base, altura)}")
}