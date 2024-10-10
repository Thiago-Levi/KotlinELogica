fun main(){
    println("Preço unitário do produto: ")
    val unPrice = readln().toDouble()

    println("Quantidade comprada!")
    val qtdPurchase = readln().toInt()

    println("Dinheiro recebido!")
    val cash = readln().toDouble()

    fun changeCash(unPrice: Double, qtdPurchase: Int, cash: Double): Double{
        val valueOfPurchase = cash - (unPrice * qtdPurchase)

        return valueOfPurchase
    }
    val result = changeCash(unPrice, qtdPurchase, cash)

    println(result)


}