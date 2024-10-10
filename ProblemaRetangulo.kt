import kotlin.math.sqrt

fun main() {
    //entradas
    println("Digite a Base: ")
    val base = readln().toFloat()
    println("Digite a Altura: ")
    val height = readln().toFloat()

    fun rectangleProblem(base: Float, height: Float): String {
        fun area(base: Float, height: Float): Float {
            return base * height
        }
        fun perimeter(base: Float, height: Float): Float {
            return (base * 2)  + (height * 2)
        }
        fun diagonal(base: Float, height: Float): Float {
            val diagonal = (base * base) + (height * height)
            return sqrt(diagonal)
        }

        val areaA = area(base, height)
        val perimeterP = perimeter(base, height)
        val diagonalD = diagonal(base, height)

        return "Area: $areaA \n Perímetro: $perimeterP \n Diagonal: $diagonalD"
    }

    val result = rectangleProblem(base, height)
    println(result)

}