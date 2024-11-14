fun main(){
    fun fastfoodProblem(code: Int): String{
        var price = 0.0

        price = when(code){
            1 -> 5.00
            2 -> 3.50
            3 -> 4.80
            4 -> 8.90
            5 -> 4.32
            else -> return "Código inválido"
        }
        return "Código: $code - Valor: ${String.format("%.2f", price)}"
    }

    val output = fastfoodProblem(100)
    println(output)

}
