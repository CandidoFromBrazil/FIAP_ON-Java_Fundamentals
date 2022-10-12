package br.com.fiat.si;

/*
 * importing class scanner to use as input
 */
import java.util.Scanner;
		
public class Entrada_E_Saida {
	public static void main(String[] args){
		//exit syntax
		System.out.println("a print so as to exit a data");
		//input syntax
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		System.out.println("Age value: " + age);
		input.close();
	}
}
