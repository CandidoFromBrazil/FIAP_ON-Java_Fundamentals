package LoopsArraisStringCollections;

import java.util.Scanner;
public class matriz {
	public static void main(String[] args) {
		//nas matrizes, primeiro vem: [indice 0][indice 0.1...]
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[2][3];
		for(int i = 0; i < 2; i++) {
			for(int p = 0; p < 2; p++) {
					matriz[i][p] = input.nextInt();
					System.out.print(matriz[i][p]);
			}
		}
		input.close();

	}
}
