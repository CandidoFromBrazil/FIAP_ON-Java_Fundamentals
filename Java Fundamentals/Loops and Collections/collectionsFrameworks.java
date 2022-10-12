package LoopsArraisStringCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class collectionsFrameworks {
	
	public static void main(String[] args) {
		//arrayList
		 // Methods:
		 
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList();

		
		//add()
		list.add("value1");
		list.add("value2");
		list.add("value3");

		//get
		System.out.println(list.get(0));
		System.out.println(list.size()); //size(3)
		
		//remove
		list.remove(0);
		System.out.println(list.get(0));
		
		//size
		System.out.println(list.size()); //size(2) pass remove
		
		//set = cut
		list.set(0, "value1");
		System.out.println(list.get(0));
		
		//indexOf
		list.add("value4");
		System.out.println(list.indexOf("value4")); //0-1-(2) index
		System.out.println(list.size()); //size(3)
		
		//lastIndexOf
		list.add("value4");
		System.out.println(list.lastIndexOf("value4")); //0-1-2-(3) index
		
		//toArray
		list.toArray();
		System.out.println(list);
		
		//subList
		System.out.println(list.subList(0, 3));
		
		//reading values in <list> with (for)
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//Scanner + list
		list.add(scanner.next());
		System.out.println(list);
	}
}
