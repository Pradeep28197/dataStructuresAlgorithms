package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListCollections {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Pradeep");
		names.add("Arthika");
		names.add("Prad");
		names.add("Art");
		ListIterator<String> iterator = names.listIterator();
		LinkedList<String> names1 = new LinkedList<String>();
		names1.add("Elon");
		names1.add("Tesla");
		names1.add("Hawking");

		names1.removeFirst();
		names1.removeLast();
		for(String name:names1) {
			System.out.println(name);
		}
		names1.addFirst("Einstein");
		names1.addLast("Mark");
		Iterator<String> name1Iterator = names1.iterator();
		while(name1Iterator.hasNext()) {
			String name = name1Iterator.next();
			System.out.println(name);
		}
//		while(iterator.hasPrevious()) {
//			String name = iterator.previous();
//			System.out.println(name);
//		}
		
	}

}
