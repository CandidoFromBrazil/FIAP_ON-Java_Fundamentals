package LoopsArraisStringCollections;

import java.util.Scanner;
public class loopdowhile {
	
	public static void main(String[] args) {
		
		int contador = 0;
		do {
			contador -= 1;
			System.out.println(contador);
		}while(contador > -10);
		
		
		Scanner input = new Scanner(System.in);
		String opcao;
		do {
			System.out.println("Type up a number");
			int number1 = input.nextInt();
			System.out.println("Type up another number");
			int number2 = input.nextInt();
			int sum = number1 + number2;
			System.out.println("The sum is" + sum);
			System.out.println("Wish to sum any other numbers?");
			opcao = input.next();
		}while(opcao.equals("Yes"));
		input.close();
	}
}
