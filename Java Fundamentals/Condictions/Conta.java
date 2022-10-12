package br.com.fiat.si;

/**
 *Classe que abstrai uma Conta Bancária 
 * @author Matheus Willians 
 * @version 1.0 
 */
public class Conta {
	/**
	 * numero da conta
	 */
	public int numero;
	/**
	 * saldo da conta
	 */
	public double saldo;
	/**
	 * agencia da conta
	 */
	protected int agencia;
	
	//tipos de métodos construtores
	public Conta(){
		
	}
	public Conta(double saldo){
		this.saldo = saldo;
	}
	
	//métodos
	/**
	 *Verifica o saldo da conta
	 * @return Valor do saldo da conta
	 */
	public double recuperarSaldo(){
		return saldo;
	}
	/**
	 *Deposita um valor ao saldo da conta 
	 * @param valor Valor a ser depositado 
	 */
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	//sobrecarga de métodos
	/**
	 *Retira um valor do saldo da conta
	 * @param valor Valor a ser retirado 
	 */
	public void retira(double valor){
		this.saldo = saldo - valor;
	}
	public void retira(double valor, double taxa) {
		this.saldo = valor - taxa;
		
	}
	public void setAgencia(int agencia){
		this.agencia = agencia;
	}
	public void setNumber(int numero){
		
	}
}
