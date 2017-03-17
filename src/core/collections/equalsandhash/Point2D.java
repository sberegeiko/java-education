package core.collections.equalsandhash;

public class Point2D implements Comparable<Point2D> {
	public final int x;
	public final int y;
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj == null) {
//			return false;
//		}		
//		if(this.getClass() != obj.getClass()) {
//			return false;
//		}		
//		Point2D that = (Point2D) obj;		
//		return this.x == that.x && this.y == that.y;		
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int compareTo(Point2D that) {
		int dX = this.x - that.x;
		if (dX != 0) {
			return dX;
		} else {
			return this.y - that.y;
		}
	}
}