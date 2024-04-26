package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// hashset, linked hashset and tree set classes implementing the set interface
		// set doesn't accept duplicate value
		// there is no guarentee that elements store in sequential order, it store in
		// random order
		HashSet<String> hs = new HashSet<String>();
		// this class doesn't have methods related to index
		hs.add("joshua");
		hs.add("Antony");
		hs.add("joshua");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("joshwa"));
		hs.clear();
		System.out.println(hs.isEmpty());
//		int ++a=1;//you cannot directly increment  variable in a declaration
//		System.out.println(++a);
		hs.add("joshua");
		hs.add("Antony");
		hs.add("joshua");
		hs.add("John");
		hs.add("Kumar");
		hs.add("ali");
		// to iterate a set
		Iterator<String> it = hs.iterator();
        while(it.hasNext())//Returns:true if the iteration has more elements
        {
        	System.out.println(it.next());//Returns the next element in the iteration.
        }
		

	}

}
