package core.collections.equalsandhash;

import java.util.NavigableSet;
import java.util.TreeSet;

class TestStrTreeSet {
	public static void main(String[] args) {
		NavigableSet<String> set = new TreeSet<>(new StrComparator());
		set.add("a");
		set.add("b");
		set.add("ay");
		set.add("ax");
		set.add("c");
		set.add("f");
		set.add("d");
		set.add("e");

		System.out.println(set);
		System.out.println(set.iterator().next());
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set.pollLast());
		System.out.println(set);

		NavigableSet<String> subSet = set.subSet("b", true, "e", false);
		System.out.println(subSet);
	}
}