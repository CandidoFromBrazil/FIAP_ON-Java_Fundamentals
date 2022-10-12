package Herança;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		Conta client = new Conta();
		Scanner input = new Scanner(System.in);
		client.deposit(input.nextDouble());
		client.withdraw(input.nextDouble());
		client.setNumber(input.nextInt());
		client.setAgency(input.nextInt());
		client.getaccountBalance();
		
		
		System.out.println("Your bank and account's ID: " + client.getNumber() + "." + client.getAgency());
		System.out.println("Your account balance: " + client.getaccountBalance());
		
		input.close();
		
		//Second, third Object
		//É possivél atribuir um objeto tipo(ContaCorrente) em uma variável do tipo(Conta);
		Conta clienteEspecial = new ContaCorrente("Special");//objeto tipo conta, mas inicia o contrutor de contaCorrente;
		clienteEspecial.deposit(100);
		//método vindo da SuperClass, usado na subclasse;
		System.out.print(clienteEspecial.getaccountBalance() + "\n");
		if (clienteEspecial instanceof Conta) {
			System.out.println("clienteEspecial is a Conta Instance");
		}else {
			System.out.println("Dreadfuly wrong");
		}
	}
}
