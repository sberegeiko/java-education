package core.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class App02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("b");
		System.out.println(list);
		
		System.out.println(list.get(1));
		System.out.println(list.set(1, "sss"));
		list.add(0, "CCC");
		
		System.out.println(list);
		
		list.remove("b");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
	}
}
