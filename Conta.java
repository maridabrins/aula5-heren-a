package entidade;

public class Conta {
	
	public int numero;
	public String nome;
	private double saldo;
	
	public Conta(String nome, int numero, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/*public void Depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	public void Sacar(double valorSaque) {
		saldo -= valorSaque;
	}*/

	/*@Override
	public String toString() {
		return "Conta \nnumero da conta = " + numero + " \nnome do usúario = " + nome + " \nsaldo atual = R$" + saldo;
	}*/
	
	public String mostrar() {
		return "Nome: " + nome + "\nNúmero da conta: " + numero + "\nSaldo R$: " + saldo;
	}
	

}
