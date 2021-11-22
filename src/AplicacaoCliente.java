import java.util.HashSet;

public class AplicacaoCliente {

	public static void main(String[] args) {
		ClienteDaLoja cliente = new ClienteDaLoja("Yohan Colaço Espargosa");
		ContaCliente conta = new ContaCliente("yespargosa");
		ProdutosCliente item = new ProdutosCliente ("camisa polo GG");
		HashSet<ProdutosCliente> items = new HashSet();

		Fachada facade = new Fachada();
		facade.verConta(1501210274, cliente, conta, item);
	}
}