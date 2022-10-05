package list

fun main() {
    //groupby retorna uma chave que é a editora nesse caso
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida"}
        .forEach { (editora, livros) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}