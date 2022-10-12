package br.com.fiap.banco.teste;

public class Calculadora {

	int valorA;
	int valorB;
	int overall;

	public Calculadora(){
	
	}

	public Calculadora(int a, int b){
		this.valorA = a;
		this.valorB = b;
	}

	public int Soma(int a, int b){
		this.overall = a + b;
		return overall;
	}

	public int Subtracao(int a, int b){
		this.overall = a - b;
		return overall;
	}
	
	public int Divisao(int a, int b){
		this.overall = a / b;
		return overall;
	}
	
		public int Multiplicacao(int a, int b){
		this.overall = a * b;
		return overall;
	}
}
