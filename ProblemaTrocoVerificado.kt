fun main(){

    fun cashVerify(unPrice: Double, qtdPurchase: Int, cash: Double): String{

        val totalValue = qtdPurchase * unPrice

        if(totalValue > cash){
            return "Valor insuficiente!"
        }

        return (cash - totalValue).toString()

    }

    val output = cashVerify(10.0, 10, 1000.0)
    println(output)
}