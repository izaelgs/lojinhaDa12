public class ProdutosCliente {
    private String produto;
    

   
	public String produtoNoCarrinho(){
		return this.produto;
	}

	public ProdutosCliente(){}

	public ProdutosCliente(String produto){
		this.produto = produto;
	}
}
