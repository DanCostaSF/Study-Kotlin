package arrays

fun main() {
    for(s in 0..10) {
        print("$s ")
    }
    println(" ")
    val numerosPares = 2.until(100) step 2
    for (par in numerosPares) {
        print("$par ")
    }
    println("")

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ") }
    println("")

    val intervalo = 1500.0..5000.0
    val salario = 5001.0

    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    println("")

    val alfabeto = 'a'..'z'

    val letra = 'k'
    println(letra in alfabeto)
}