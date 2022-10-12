package br.com.fiap.banco.teste;


import br.com.fiat.si.Conta;

public class ContaCliente {
	public static void main(String[] args){

		//Instanciando objetos
		Conta cliente1 = new Conta(100);
		
		//uso do método recuperaSaldo
		double saldoCliente1 = cliente1.recuperarSaldo();
		System.out.println("O saldo do cliente1 é de: " + saldoCliente1);
		//uso dos métodos retira e recuperaSaldo
		cliente1.retira(50);
		System.out.println(cliente1.recuperarSaldo());
		
		
		
		
		//Instanciando objeto2
		Conta Cliente2 = new Conta();
		Cliente2.depositar(200);
		Cliente2.retira(100, 10);
		Cliente2.depositar(310);
		System.out.println(Cliente2.recuperarSaldo());
		//Cliente2.agencia = 10; (Turn the Conta.agencia modifyer into a public to fix)
	}
}
