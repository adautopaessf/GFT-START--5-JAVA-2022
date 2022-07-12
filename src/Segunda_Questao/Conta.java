package Segunda_Questao;

public abstract class Conta {
	private int numConta;
    private String titular;
    private double saldo;

// M�todo Construtor    
    public Conta(int numConta, String titular, double saldo) {
	this.numConta = numConta;
	this.titular = titular;
	this.saldo = saldo;
}
    
// M�todos personalizados para depositar e sacar os valores que est�o na conta
    public void depositar(double s) {
            this.setSaldo(this.getSaldo() + s);
            System.out.println("Dep�sito realizado na conta com sucesso!"); 
    }
    
	public void sacar(double s) {
            if (this.getSaldo() >= s) {
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Saque realizado no valor de R$" + s);     
            } else {
                System.out.println("Saldo insuficiente para saque!");
            } 
    }
  
// M�todo que ir� retornar o rendimento mensal da conta
	public abstract void rendimento();

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    
    public void InfConta() {
    	System.out.println("-------------------------");
    	System.out.println("Conta: " + this.getNumConta());
    	System.out.println("Titular: " + this.getTitular());
    	System.out.println("Saldo: " + this.getSaldo());
    }
	
}
