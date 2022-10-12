package LoopsArraisStringCollections;

import java.util.HashSet;

public class SetHashSet {
	public static void main(String[] args) {
		
		//HashSet can't contain repeated values!
		 //Methods:
		
		HashSet<String> collection = new HashSet();
		
		//add
		collection.add("value1");
		System.out.println(collection);

		//clear
		collection.clear();
		System.out.println(collection);
		
		//contain
		collection.add("value1");
		System.out.println(collection.contains("value1"));
		
		//isEmpty
		System.out.println(collection.isEmpty());
		
		//size
		System.out.println(collection.size());
		
		//toArray
		System.out.println(collection.toArray());
	}
}
