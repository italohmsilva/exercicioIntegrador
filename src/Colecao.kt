data class Colecao(
        override var codigo: Int,
        override var quantidade: Int,
        override var preco: Double,
        var listaLivros: MutableList<Livro>,
        var descricao: String
): Produto