//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Prints a message to request input
    println("Digite a largura do terreno")
    val width: Float = readln().toFloat();
    println("Digite o comprimento do terreno");
    val height: Float = readln().toFloat();

    fun terrainProblem(width: Float, height: Float): Float{
                return width * height;
    }

    val squareMeters = terrainProblem(width, height);

    println("A metragem quadrada do terreno é: $squareMeters");


// Reads and stores the user input. For example: Happiness
// Prints a message with the input

}