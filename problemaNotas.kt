fun main() {
    fun scoreProblem(score1: Double, score2: Double): String{
        val finalScore = (score1 + score2) / 2

        val passOrFail = if(finalScore < 60.0) "Reprovado" else "Aprovado"

        return "Nota final: $finalScore\nResultado: $passOrFail"
    }

    val output = scoreProblem(45.5, 31.30)
    println(output)
}