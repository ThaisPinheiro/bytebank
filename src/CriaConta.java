
public class CriaConta {
	public static void main(String[] args) {
		Cliente carlos = new Cliente();
		carlos.setNome("Carlos Souza");
		carlos.setCpf("999.999.999-99");
		carlos.setProfissao("Barbeiro");
		
		Conta contaCarlos = new Conta(1234);
		contaCarlos.depositar(300);
		contaCarlos.setTitular(carlos);
		System.out.println(contaCarlos.getTitular().getNome());
		System.out.println(contaCarlos.getSaldo());
		System.out.println(contaCarlos.getNumero());
		
		Conta contaMatheus = new Conta(4321);
		Cliente matheus = new Cliente();
		matheus.setNome("Matheus Augusto");
		contaMatheus.setTitular(matheus);
		contaMatheus.depositar(20000);
		System.out.println(contaMatheus.getTitular().getNome());
		System.out.println(contaMatheus.getSaldo());
		System.out.println(contaMatheus.getAgencia());
		System.out.println("O total de contas e: " + Conta.getTotal());
	}
}











