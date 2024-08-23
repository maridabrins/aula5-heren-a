package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta;
import entidade.ContaCorrente;
import entidade.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		List<Conta> lista = new ArrayList<>();
		
		
		System.out.print("Digite a quantidade de contas que vc quer cadastrar");
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			
		
		System.out.println("Nome: ");
		String nome = s.next();
		
		System.out.println("Número da conta: ");
		int numero = s.nextInt();
		
		System.out.println("Saldo atual: ");
		double saldo = s.nextDouble();
		
		 Conta c = new Conta(nome,numero, saldo);
		 System.out.println(c.mostrar()); 
		 
		 System.out.println("Selecione a opção desejada: "
		 		+ "\n1-Conta Poupança \n2-Conta Corrente");
		 int opcao = s.nextInt();
		 
		 if(opcao == 1 ) {
			 Conta p = new ContaPoupanca(nome, numero,saldo);
			 lista.add(p);
	
		 }
		 else if (opcao == 2 ) {
			 System.out.println("Limite: R$");
			 double limite = s.nextDouble();
			 Conta cc = new ContaCorrente(nome, numero, saldo, limite);
			 lista.add(cc);

		 }
		 System.out.println(lista);
		}		
		
		s.close();
		 }
		
		
		 
		
	
		 
		 
		
		 
		 
		 /*List<Conta> lista = new ArrayList<>();
		 
		 lista.add(c);
		 lista.add(d);
		 
		 System.out.println(lista);
		 
		 lista.remove(c);
		 System.out.println(lista);*/
		
	}
	


