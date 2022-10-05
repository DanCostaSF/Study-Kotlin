package arrays

fun main() {
    val idades = intArrayOf(10, 12, 18, 33, 40, 67)

    //maior valor da lista
    val maiorIdade = idades.max()
    println("Maior idade: $maiorIdade")

    //menor valor da lista
    val menorIdade = idades.min()
    println("Menor idade: $menorIdade")

    //media de todos os valores
    val media = idades.average()
    println("Média: $media")

   //se todas as idades forem maior que 18 retorna true
    val todosMaiores = idades.all { it >= 18 }
    println(todosMaiores)

    //se tiver qualquer idade que seja maior de 18 retorna um true
    val existeMaior = idades.any { it >= 18 }
    println("Algum aluno é maior de idade? $existeMaior")

    //filtra valores que são maiores que 18
    val maiores = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    //encontra algum valor com o mesmo, ele vai retornar o primeiro valor que encontrar
    val busca = idades.find { it > 18 }
    println("Busca: $busca")
}