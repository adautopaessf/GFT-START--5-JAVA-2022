package Segunda_Questao;

public class ContaCorrente extends Conta {
	
	protected ContaCorrente(int numConta, String titular, double saldo) {
		super(numConta, titular, saldo);
	}

	@Override
	public void rendimento() {
		double rendimento = 0.03;
		double rendimentof = this.getSaldo() + (this.getSaldo() + rendimento);
		setSaldo(rendimentof);
	}
	
}
