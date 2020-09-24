fun main(){
    val l3 = Livro("O pequeno Principe", "Joao Felipe", "1981", 22, 0, 20.00)
    val l4 = Livro("O pequeno Polegar", "Joao Pedro", "1991", 25, 150, 25.00)

    val c3 = Colecao(24, 21, 250.69, mutableListOf<Livro>(l3, l4), "livros aventura")
    val c4 = Colecao(35, 24, 250.69, mutableListOf<Livro>(l3, l4), "livros aventura")

    val sistema = Sistema()

    sistema.cadastrarProduto(l3) //cadastrando Livro
    sistema.cadastrarProduto(c3) //cadastrando Coleção
    sistema.estoque.forEach{println(it)}


    sistema.consultarProduto(22)
    sistema.consultarProduto(27)

    sistema.venda(22)
    sistema.consultarProduto(22)

}