data class Colecao(
        override var codigo: Int,
        override val quantidade: Int,
        override var preco: Double,
        var listaLivros: mutableOf<Livro>,
        var descricao: String
): Produto