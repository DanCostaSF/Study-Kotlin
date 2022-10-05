package kotlincollections

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Mario",
        "Julin",
        "Irineu",
        "Gui",
        "Cleitin"
    )
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Alex")}")

    println("Tamanho da coleção ${nomes.size}")
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}


fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salva("Ronaldo")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

