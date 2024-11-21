fun main(){

    do {
        println("Digite um numero e aperte enter")
        var firstNumber = readln().toInt()
        println("Digite outro numero e aperte enter")
        var secondNumber = readln().toInt()

        if(firstNumber < secondNumber) {
            println("Crescente")
        }else if(firstNumber > secondNumber){
            println("Decrescente")
        }else{
            println("Iguais")
        }

    }while (firstNumber != secondNumber)


}
