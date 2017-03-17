package core.collections.equalsandhash;

import java.util.Set;
import java.util.TreeSet;

class TestTreeSet {
	public static void main(String[] args) {
		Set<Point2D> set = new TreeSet<>();
		set.add(new Point2D(0, 0));
		set.add(new Point2D(0, 10));
		set.add(new Point2D(10, 0));
		
		System.out.println(set);
		System.out.println(set.contains(new Point2D(0, 0)));
		System.out.println(set.remove(new Point2D(0, 0)));
		System.out.println(set);
	}
}