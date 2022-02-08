package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		
		// Add
		
		list.add(0);
		list.add(2);
		list.add(4);
		list.add(3);
		
		System.out.println(list);
		
		// get
		
		int element = list.get(1);
		System.out.println(element);
		
		// set
		
		list.set(0, 5);
		System.out.println(list);
		
		// add element in between
		
		list.add(1,1);
		System.out.println(list);
		
		// Remove
		
		list.remove(3);
		System.out.println(list);
		
		// size
		
		System.out.println(list.size());
		
		// loop
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		// sorting
		
		Collections.sort(list);
		System.out.println(list);

	}

}
