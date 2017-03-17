package core.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class App01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.add("a");
		list.add("b");
		System.out.println(list.add("c"));
		list.add("b");
		System.out.println(list);
		System.out.println(list.contains("x"));
		System.out.println(list.contains("b"));
		System.out.println(list.remove("xxx"));
		System.out.println(list.remove("b"));
		System.out.println(list);
	}
}
