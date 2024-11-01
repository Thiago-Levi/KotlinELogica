fun main(){
    fun glucoseProblem(score: Double): String{
        val dbt = score > 140
        val elvt = score <= 140 && score > 100
        val nrml = score >= 100

        val result = if(dbt) "Diabetes" else if (elvt) "Elevado" else "Normal"

        return "Classificação $result"
    }

    var output = glucoseProblem(101.0)

    println(output)

}
