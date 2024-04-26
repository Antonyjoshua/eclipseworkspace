package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
	//Hashmap, treemap and linkedhash map implements the map interface
    //it doesn't contain duplicate values, if both keys and values are same
    //It takes values in the form of key, value pair
		
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		hm.put(0, "Antony");
		hm.put(1, "joshua");
		hm.put(2, "Bca");
		hm.put(3, "Arkashya");
		hm.put(4, null);
		System.out.println(hm);
		System.out.println(hm.containsValue("Bca"));
		System.out.println(hm.get(3));
		hm.replace(3, "Congnizant");
		System.out.println(hm);
		//tranverse to the map
		//we need to change the map to set
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		//to separate the key and value
		
		Set entrySet1 = hm.entrySet();
		Iterator iterator1 = entrySet1.iterator();
		while(iterator1.hasNext())
		{

			Map.Entry me= (Map.Entry) iterator1.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
	}


}
