public class ContaCliente {
    private String conta;
    private int cpf;
    public int pacoteServico;

    public int obterCpf (int numcpf) {
        return numcpf;

    }

	public String obterIDConta(){
		return this.conta;
	}

    public int obterNumCpf(){
		return this.getCpf();
	}


	public ContaCliente(){}

	public ContaCliente(String conta){
		this.conta = conta;
	}

	public int getCpf() {
		return cpf;
	}

	public int setCpf(int cpf) {
		this.cpf = cpf;
		return cpf;
	}
}

