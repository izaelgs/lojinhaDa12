public class Fachada {
	private ClienteDaLoja cliente;
	private ContaCliente conta;
	private ProdutosCliente item;

	public Fachada() {
		this.cliente = new ClienteDaLoja();
		this.conta = new ContaCliente();
		this.setItem(new ProdutosCliente());
	}

	public ProdutosCliente getItem() {
		return item;
	}

	public void setItem(ProdutosCliente item) {
		this.item = item;
	}

	public void verConta(int quantidade, ClienteDaLoja cliente, ContaCliente conta, ProdutosCliente item){
		System.out.printf("Nome do cliente: %s\n",cliente.obterNomeCliente());
		System.out.printf("ID: %s\n", conta.obterIDConta());
		System.out.printf("Seu CPF: %s\n", quantidade);
		conta.setCpf(conta.getCpf() + quantidade);
		System.out.printf("Produto no carrinho: %s\n",item.produtoNoCarrinho());
		

	}

	public ClienteDaLoja getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDaLoja cliente) {
		this.cliente = cliente;
	}

	public ContaCliente getConta() {
		return conta;
	}

	public void setConta(ContaCliente conta) {
		this.conta = conta;
	}
}

