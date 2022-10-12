package br.com.fiat.si;

public class operadoresAlgebricosLogicos {
	public static void main(String[] args){
		int x = 10;
		x = x + 19;
		System.out.println("X value: " + x);
		int idade = 40;
		//Working with logical values
		boolean precisaVotar = idade > 18 && idade < 70;
		System.out.println(precisaVotar);
		boolean teste = x < 10 || x > 50;
		System.out.println(teste);
	}
}
