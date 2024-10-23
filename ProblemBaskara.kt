
import kotlin.math.sqrt

fun main(){
    fun baskara(coefficientA: Int, coefficientB: Int, coefficientC: Int ): String{
        val delt  = (coefficientB * coefficientB) - (4 * (coefficientA * coefficientC)).toDouble()

        if(delt >= 0){
            val deltR: Double = sqrt(delt)
            val x1 = - coefficientB +  deltR / (2 * coefficientA)
            val x2 = coefficientB - deltR / (2 * coefficientA)

            return "DELT: $delt X1: $x1, X2: $x2 "
        }

        return "Equação não possui raizes reais!"


    }
    val out = baskara(1, 3, 4)
    println(out)
}
