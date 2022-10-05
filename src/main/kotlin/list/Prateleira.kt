package list

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    //sortBy(presente só para mutable list) muda a lista em si,
    // sortedBy(só list) retorna uma nova lista e não interfere na principal
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAno() : List<Livro> {
        return livros.sortedBy { it.anoPublic }
    }
}
