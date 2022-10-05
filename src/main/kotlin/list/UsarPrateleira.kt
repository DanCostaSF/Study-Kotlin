package list

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)
    val porAno = prateleira.organizarPorAno()
    val porAutor = prateleira.organizarPorAutor()
    porAno.imprimeComMarcadores()
    porAutor.imprimeComMarcadores()
}