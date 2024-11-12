fun main(){
    fun fastfoodProblem(code: Int): String{
        var price = 0.0

        when(code){
            1 -> price = 5.00
            2 -> price = 3.50
            3 -> price = 4.80
            4 -> price = 8.90
            5 -> price = 4.32
            else -> return "Código inválido"
        }

        return "Código: $code - Valor: ${String.format("%.2f", price)}"
    }

    val output = fastfoodProblem(100)
    println(output)

}
