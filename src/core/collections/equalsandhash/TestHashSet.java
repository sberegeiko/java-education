package core.collections.equalsandhash;

import java.util.HashSet;
import java.util.Set;

class TestHashSet {
	public static void main(String[] args) {
		Set<Point2D> set = new HashSet<>();
		set.add(new Point2D(0, 0));
		set.add(new Point2D(0, 0));
		
		System.out.println(set);
		System.out.println(set.contains(new Point2D(0, 0)));
		System.out.println(set.remove(new Point2D(0, 0)));
		System.out.println(set);
	}
}