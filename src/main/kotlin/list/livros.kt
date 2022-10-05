package list

val listaDeLivros = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Varedas",
        autor = "João Guimarães Rosa",
        anoPublic = 1956
    ),
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublic = 1942,
        editora = "Editora A"
    ),
    Livro(
        "Memória Póstumas de Brás Cubas",
        "Machado de Assis",
        1881
    ),
    Livro(
        "Sagarana",
        "João Guimarães Rosa",
        1946
    ),
    Livro(
        titulo = "Tirarana",
        autor = "Cleitin Pica Seca",
        anoPublic = 1900,
        "Editora A"
    ),
    Livro(
        "Iracema",
        "José de Alencar",
        1865,
        "Editora B"
    ),
    Livro(
        "Vidas Secas",
        "Graciliano Ramos",
        1938,
        "Editora A"
    ),
    Livro(
        "Mayombe",
        "Pepetela",
        1979,
        "Editora B"
    ),
    Livro(
        "O Cortiço",
        "Aluísio Azevedo",
        1890,
        "Editora B"
    )
)

val listaLivrosComNulos : MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "Grande Sertão: Varedas",
        autor = "João Guimarães Rosa",
        anoPublic = 1956
    ),
    null,
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublic = 1942,
        editora = "Editora A"
    ),
    Livro(
        "Memória Póstumas de Brás Cubas",
        "Machado de Assis",
        1881
    ),
    Livro(
        "Sagarana",
        "João Guimarães Rosa",
        1946
    ),
    null,
    Livro(
        titulo = "Tirarana",
        autor = "Cleitin Pica Seca",
        anoPublic = 1900,
        "Editora A"
    ),
    Livro(
        "Iracema",
        "José de Alencar",
        1865,
        "Editora B"
    ),
    Livro(
        "Vidas Secas",
        "Graciliano Ramos",
        1938,
        "Editora A"
    ),
    null,
    Livro(
        "Mayombe",
        "Pepetela",
        1979,
        "Editora B"
    ),
    Livro(
        "O Cortiço",
        "Aluísio Azevedo",
        1890,
        "Editora A"
    )
)