class Sistema() {
    val estoqueLivros = mutableListOf<Livros>(livro1(codigo=12,titulo="O pequeno Principe",autor="Joao Felipe",anoLancamento="1981",quantidade=120,preco=20.00),
            livro2(codigo=14,titulo="O pequeno Polegar",autor="Joao Pedro",anoLancamento="1991",quantidade=150,preco=25.00))
    val estoqueColecao = mutableListOf<Colecao>(colecao1(codigo=100,descricao="Aventura",quantidade=150,preco=25.00))

    fun cadastrarLivro(livro:Livro) {
        estoqueLivros.add(livro)
    }
    fun cadastrarColecao(colecao:Colecao){
        estoqueColecao.add(colecao)
    }
    fun consultarLivro(codigo:Int): Livro {
        try{
            estoqueLivros.forEach{ return it if (it.codigo == codigo)}
        }
    }

}