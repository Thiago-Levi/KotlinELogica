import kotlin.math.PI

fun main(){
    println("Digite a área do círculo")
    val rainOfCircle = readln().toDouble()

    fun circleProblem(rainOfCircle: Double): Double{

        val areaOfCircle = PI * (rainOfCircle * rainOfCircle)

        return areaOfCircle
    }

    val result = circleProblem(rainOfCircle)
    println("AREA: $result")



 }