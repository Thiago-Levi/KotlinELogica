import java.text.DecimalFormat

fun main(){

    val decimalFormat = DecimalFormat("0.00")

    fun paymentProblem(name: String, payForHour: Double, totalHours: Double): String{


        val totalPayment = totalHours * payForHour
        val totalPaymentFormated = decimalFormat.format(totalPayment)
        return "O pagamento total do Sr. $name é $totalPaymentFormated"
    }

    val finalOutput = paymentProblem("José", 100.1, 1.5 )

    println(finalOutput)


}
