package LoopsArraisStringCollections;

public class loopfor {

	public static void main(String[] args) {
		int number1 = 1;
		int number2 = 0;
		int sum;
		for(int i = 0; i <= 10; i++) {
			sum = number1 + number2;
			number2 = number1;
			number1 = sum;
			System.out.println(number2);
		}
	}
}
