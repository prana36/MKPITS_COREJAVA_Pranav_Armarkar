package com.mkpits.vacations;

import java.util.HashMap;
import java.util.Map;

public class KeySetHashMap {

	public static void main(String[] args) 
	{
/*
	11. Set keySet()
Parameters: This method has no argument.

Returns: This method returns a set containing keys of the specified map.
 */
		Map<Integer, String> hMap1 = new HashMap<>();

		// adding element in HashMap
		hMap1.put(234, " Vaibhav");
		hMap1.put(54, " Tanmay");
		hMap1.put(65, " Nitin");
		hMap1.put(635465, "kjadbffs");
		
		System.out.println("Map{} is -->"+hMap1);
		System.out.println("This method gives Keys of HashMap in a Set[] --> "+hMap1.keySet());
	}

}
