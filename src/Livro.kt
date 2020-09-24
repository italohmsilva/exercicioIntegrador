data class Livro (
    val titulo: String,
    val autor: String,
    val anolancamento: String,
    override var codigo: Int,
    override var quantidade: Int,
    override var preco: Double
) : Produto