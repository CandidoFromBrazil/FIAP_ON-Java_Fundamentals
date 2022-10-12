package br.com.fiap.banco.teste;

import java.util.Scanner;

public class CalculoCalculadora {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Calculadora equacao1 = new Calculadora();
		System.out.println("Entre com um inteiro: ");
		equacao1.valorA = input.nextInt();
		System.out.println("Entre com outro inteiro: ");
		equacao1.valorB = input.nextInt();
		System.out.println("O valor da equação é:" + equacao1.Soma(equacao1.valorA, equacao1.valorB));
		System.out.println("O valor da equação é:" + equacao1.Subtracao(equacao1.valorA, equacao1.valorB));
		System.out.println("O valor da equação é:" + equacao1.Divisao(equacao1.valorA, equacao1.valorB));
		System.out.println("O valor da equação é:" + equacao1.Multiplicacao(equacao1.valorA, equacao1.valorB));
		input.close();
	}
	
}
