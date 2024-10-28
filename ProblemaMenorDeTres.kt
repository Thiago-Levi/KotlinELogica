fun main(){
    fun minorOfThree(numberA: Int, numberB: Int, numberC: Int): Int{
        var minor = numberA
        if(minor > numberB) minor = numberB
        if(minor > numberC) minor = numberC
        return minor
    }

    val output = minorOfThree(0, 200, 3)

    println(output)



}