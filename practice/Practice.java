package practice;

import java.util.Iterator;
import java.util.LinkedList;

public class Practice {

	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();
		
		name.push("Tom");
		name.push("Sam");
		name.push("Curry");
	
		
		Iterator<String> it = name.iterator();
		name.add(2,"Tommy");

		for(String s: name) {
			System.out.println(s);
		}
		
		
	}

}
