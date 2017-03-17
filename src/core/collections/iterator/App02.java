package core.collections.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("A", "BB", "A"));
		System.out.println(list);
		Set<String> set = new HashSet<>(list);
		System.out.println(set);
		ArrayList<String> list2 = new ArrayList<>(set);
		Collections.sort(list2);
		System.out.println(list2);
	}
}
