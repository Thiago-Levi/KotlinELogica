fun main(){
    fun salaryProblem(currentSalary: Double): Double {
        val newSalary = when(currentSalary){
            in 1.0..1000.0 -> currentSalary * 1.2
            in 1001.0..3000.0 -> currentSalary * 1.15
            in 3001.0 .. 8000.0 -> currentSalary * 1.1
            else -> currentSalary * 1.05
        }


        return newSalary
    }

    fun percentage (valueA: Double, valueB: Double): String{
        val valueOfPercentage = ((valueB - valueA) / valueA) * 100

        return "$valueOfPercentage %"

    }
    val output = salaryProblem(8000.00)

    println(output)
    println(percentage(8000.0, output))

}
