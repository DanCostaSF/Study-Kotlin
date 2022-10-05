package list

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublic: Long,
    val editora: String? = null
) : Comparable<Livro> {
   //metodo responsavel por ordernar os livros
    override fun compareTo(other: Livro): Int {
     return this.anoPublic.compareTo(other.anoPublic)
    }
}
