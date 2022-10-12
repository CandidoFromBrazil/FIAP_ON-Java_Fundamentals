package LoopsArraisStringCollections;

import java.util.HashMap;

public class _Map {

	public static void main(String[] args) {
		
		//HashMap use keys : values - as a dictionary
		 //Methods:
		
		HashMap map = new HashMap<String, String>();
		
		//put
		map.put("key1", "value1");
		System.out.println(map);
		
		//cointainsKeys
		System.out.println(map.containsKey("key1"));
		
		//containsValue
		System.out.println(map.containsValue("value1"));
		
		//get
		System.out.println(map.get("key1"));
		
		//isEmpty
		System.out.println(!map.isEmpty());
		
		//keySet
		map.put("key2", "value2");
		System.out.println(map.keySet());
		
		//values
		System.out.println(map.values());
		
		//size
		System.out.println(map.size());
		
		//remove
		map.remove("key1");
		System.out.println(map.keySet());
	}
}
