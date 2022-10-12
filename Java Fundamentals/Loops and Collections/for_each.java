package LoopsArraisStringCollections;

public class for_each {
	public static void main(String[] args) {
		int[] vetor = new int[20];
		for(int x = 0; x < 10; x++) {
			vetor[x] = x;
		}
		for(int i : vetor) {
			if(i %2 == 1) {
				System.out.print(i);
			}
		}
	}
}
