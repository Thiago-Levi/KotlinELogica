import kotlin.math.pow

fun main(){
    fun measuresProblem(sideA: Double, sideB: Double, sideC: Double ): String{
            fun squartArea(sideA:Double): Double{
                    return sideA.pow(2)

            }

            fun triangleRetangle(sideA: Double, sideB: Double ): Double{
                return (sideA * sideB) / 2
            }


            fun trapeziArea(sideA: Double, sideB: Double, sideC: Double): Double{

                return ((sideA + sideB) * sideC) / 2.0
            }

        return "AREA DO QUADRADO: ${ squartArea(sideA)}\nAREA DO TRIÂNGULO: ${triangleRetangle(sideA, sideB)}\nAREA DO TRAPÉZIO: ${trapeziArea(sideA, sideB, sideC)}"
    }


    val outPut = measuresProblem(4.0, 3.5, 5.2)

    println(outPut)
}