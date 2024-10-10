fun main(){
    fun ageProblem(ageA: Int, ageB: Int): Double{
        return ((ageA + ageB) / 2).toDouble()
    }

    println("Digite o nome da 1º pessoa:")
    val nameA = readln()
    println("Digite a idade da 1º pessoa:")
    val ageA = readln().toInt()

    println("Digite o nome da 2º pessoa:")
    val nameB = readln()
    println("Digite a idade da 2º pessoa:")
    val ageB = readln().toInt()

    val result = ageProblem(ageA, ageB)

    println("A média de idade entre $nameA e $nameB é $result")
}