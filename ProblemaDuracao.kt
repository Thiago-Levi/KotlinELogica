fun main() {
    fun durationProblem(timeInSeconds: Int): String {

        val hours = timeInSeconds / 3600
        val minutes = (timeInSeconds % 3600) / 60
        val seconds = timeInSeconds % 60

        return "$hours:$minutes:$seconds"

    }

    val output = durationProblem(12506)

    println(output)

}