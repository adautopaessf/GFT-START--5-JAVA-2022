package Segunda_Questao;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente p1 = new ContaCorrente(0, null, 0);
		p1.setNumConta(001);
		p1.setSaldo(50.0);
		p1.setTitular(null);
		p1.rendimento();
		
		ContaPoupanca p2 = new ContaPoupanca(0, null, 0);
		p2.setNumConta(001);
		p2.setSaldo(50.0);
		p2.setTitular(null);
		p2.rendimento();
		
		p1.InfConta();
		p2.InfConta();

	}

}
