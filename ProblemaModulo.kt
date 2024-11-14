fun main(){
    fun gameTimer(initialHours: Int, finalHours: Int): Int{

        if(initialHours < finalHours){
            return finalHours - initialHours
        }
        if(initialHours > finalHours){
            return (24 + finalHours) - initialHours
        }
        return 24
    }

    val output = gameTimer(16, 2)

    println(output)
}
