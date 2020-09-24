class Sistema() {
    val l1 = Livro("O pequeno Principe", "Joao Felipe", "1981", 12, 120, 20.00)
    val l2 = Livro("O pequeno Polegar", "Joao Pedro", "1991", 45, 150, 25.00)

    val c1 = Colecao(14, 21, 250.69, mutableListOf<Livro>(l1, l2), "livros aventura")
    val c2 = Colecao(15, 24, 250.69, mutableListOf<Livro>(l1, l2), "livros aventura")

    val estoque = mutableListOf(c1, c2, l1, l2)

    fun cadastrarProduto(produto: Produto) {
        estoque.add(produto)
    }


    fun consultarProduto(codigo: Int) {


        var produtoEncontrado = false
        estoque.forEach {
            if (it.codigo == codigo) {
                produtoEncontrado = true
                println(it)

            }
        }
        if (!produtoEncontrado) {
            println("Produto não encontrado!")
        }
    }

    fun venda(codigo: Int) {
        var produtoEstoque = false
        estoque.forEach {
            if (it.codigo == codigo) {
                if (it.quantidade > 0) {
                    it.quantidade--
                    produtoEstoque = true
                    println("Venda efetuada")
                } else {
                    estoque.remove(it)
                    println("Produto Esgotado")

                }
            }
        }
        if (estoque.isEmpty()) {
            println("Estoque esgotado")
        }
    }

}



