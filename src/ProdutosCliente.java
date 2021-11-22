public class ProdutosCliente {
    public String produto;
    public int preco;
    

   
	public String produtoNoCarrinho(){
		return this.produto;
	}

	public ProdutosCliente(){}

	public ProdutosCliente(String produto){
		this.produto = produto;
	}
}
