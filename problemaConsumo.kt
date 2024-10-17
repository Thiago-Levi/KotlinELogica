import java.text.DecimalFormat

fun main() {

    val decimalFormat = DecimalFormat("0.00")

    fun consumeProblem(fuel: Double, distance: Double): String {
        val consume = fuel / distance
        return "O consumo foi de ${decimalFormat.format(consume)}"
    }

    val finalOutput = consumeProblem(500.00, 38.50)

    println(finalOutput)

}

