package core.collections.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("A", "BB", "CCC"));
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for(Iterator<String> iter1 = list.iterator(); iter1.hasNext();) {
			System.out.println(iter1.next());
		}
	}
}
