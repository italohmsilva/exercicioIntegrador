data class Colecao(
        override val codigo: Int,
        override var quantidade: Int,
        override val preco: Double,
        val descricao: String,
        val listaLivros: MutableList<Livro>
) : Produto