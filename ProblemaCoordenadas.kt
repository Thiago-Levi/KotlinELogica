fun main(){
    fun coordinatesProblem(Xcoordinate: Double, Ycoordinate: Double): String{

        val q1 = Ycoordinate > 0 && Xcoordinate > 0
        val q2 = Ycoordinate > 0 && Xcoordinate < 0
        val q3 = Ycoordinate < 0 && Xcoordinate < 0
        val q4 = Ycoordinate < 0 && Xcoordinate > 0

        if (q1) return "Q1"
        if (q2) return "Q2"
        if (q3) return "Q3"
        if (q4) return "Q4"
        if (Xcoordinate == 0.0 && Ycoordinate != 0.0) return "EIXO Y"
        if (Ycoordinate == 0.0 && Xcoordinate != 0.0) return "EIXO X"

        return "ORIGEM"
    }

    val output = coordinatesProblem(0.0, 4.0)
    println(output)

}