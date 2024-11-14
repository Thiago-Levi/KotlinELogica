fun main (){
    fun multipleProblem(numberOne: Int, numberTwo: Int): Boolean{
        return numberOne % numberTwo == 0 || numberTwo % numberOne == 0
    }

    if(multipleProblem(13, 5)){
        println("São Múltiplos")
    }else{
        println("Não são múltiplos")
    }


}
