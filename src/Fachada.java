import java.util.HashSet;

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
	
	public boolean efetuarCompra(ClienteDaLoja cliente, ContaCliente conta, HashSet<ProdutosCliente> items) {				
		if(cliente == null || conta == null || item == null) {
			compra pedido = new compra();
			System.out.printf("Nome do cliente: %s\n",cliente.obterNomeCliente());			
			System.out.printf("Seu CPF: %s\n", conta.obterCpf());
			pedido.idCliente = conta.obterIDConta();
						
			
			System.out.println("Produto no carrinho: \n");
			for(ProdutosCliente item_ : items) {
				pedido.valorTotal += item_.preco;
				pedido.produtos += item_.produto + ";";
				System.out.println("	" + item.produtoNoCarrinho());
			}
			
			BancoDados db = new BancoDados();
			db.adicionarRegistro(pedido);			
			return true;
		}else	
			return false;
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

