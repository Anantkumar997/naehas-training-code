package LinkedList;
import java.util.*;
public class InBuildLL {
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.addFirst("This");
		System.out.println(list);
		list.add("is");
		System.out.println(list);
		list.addLast("a");
		System.out.println(list);
		list.addFirst("list");
		System.out.println(list);
		System.out.println(list.size());
		list.remove();
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("This");
		System.out.println(list);
		list.add("a");
		list.addLast("list");
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " -> ");
		}
		System.out.println("null");

	}

}
