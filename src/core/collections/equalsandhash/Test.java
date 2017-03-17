package core.collections.equalsandhash;

import java.util.ArrayList;
import java.util.List;

class Test {
	public static void main(String[] args) {
		List<Point2D> list = new ArrayList<>();
		list.add(new Point2D(0, 0));
		
		System.out.println(list);
		System.out.println(list.contains(new Point2D(0, 0)));
		System.out.println(list.remove(new Point2D(0, 0)));
		System.out.println(list);
	}
}