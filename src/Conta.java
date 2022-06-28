class Conta {
	private String agencia = "0001";
	private int numero;
	private double saldo;
	private Cliente titular;
	private static int total;
		
	public Conta(int numero) {
		if(numero <= 0) {
			System.out.println("Numero não pode ser menor ou igual a 0.");
			return;
		} else {
			System.out.println("Bem vindo ao ByteBank!");
			Conta.total++;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.printf("Valor atual e de R$%.2f \n", saldo);
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.printf("Você sacou %.2f\n", saldo);
			return true;
		} else {
			System.out.println("Saldo insuficiente!");
			return false;
		}
	}
	
	public boolean tranferir(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}







