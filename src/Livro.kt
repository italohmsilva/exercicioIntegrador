data class Livro (
    val titulo: String,
    val autor: String,
    val anolancamento: String,
    override val codigo: Int,
    override val quantidade: Int,
    override val preco: Double
) : Produto