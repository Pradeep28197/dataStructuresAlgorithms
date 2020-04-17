package collections;

import java.util.ArrayList;
import java.util.Iterator;
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
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		while(iterator.hasPrevious()) {
			String name = iterator.previous();
			System.out.println(name);
		}
		
	}

}
