package core.collections.set;

import java.util.HashSet;
import java.util.Set;

public class App02 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		set.add("a");
		set.add("b");
		set.add("a");
		//set.add("a");
		set.add("c");
		System.out.println(set);
		
		set.remove("b");
		System.out.println(set);
		
		System.out.println(set.remove(0));
	}
}
