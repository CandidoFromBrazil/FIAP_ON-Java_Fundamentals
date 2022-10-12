package LoopsArraisStringCollections;

import java.util.Scanner;
public class Array {
	
	public static void main(String[] args) {
		int notes[] = new int[10];
		notes[0] = 9;
		notes[1] = 100;
		System.out.println(notes[0]);
		
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < notes.length; i++) {
			System.out.println("Type the student's notes: ");
			notes[i] = input.nextInt();
		}
		input.close();
		
		int totalNotes = 0;
		for(int i = 0; i < notes.length; i++) {
			totalNotes += notes[i];
		}
		
		int average = totalNotes/notes.length;
		System.out.println("The average of the Students is: " + average);
	}
}
