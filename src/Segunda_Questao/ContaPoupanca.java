package Segunda_Questao;

public class ContaPoupanca extends Conta{

	
	public ContaPoupanca(int numConta, String titular, double saldo) {
		super(numConta, titular, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rendimento() {
		double rendimento = 0.05;
		double rendimentof = this.getSaldo() + (this.getSaldo() + rendimento);
		setSaldo(rendimentof);
	}

}
