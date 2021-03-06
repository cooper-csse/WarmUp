import java.util.Comparator;

/**
 * An implement of triangles with area and perimeter.
 * 
 * @author boutell. Created Dec 1, 2013.
 */
public class ShapeTriangle implements Comparable<ShapeTriangle> {

	static Comparator<ShapeTriangle> areaComparator = new Comparator<ShapeTriangle>() {
		@Override
		public int compare(ShapeTriangle a, ShapeTriangle b) {
			return (int) Math.signum(a.area() - b.area());
		}
	};

	private double a, b, c; // 3 sides

	/**
	 * Creates a triangle with the given sides.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * 
	 */
	public ShapeTriangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}


	/**
	 * @return The area of this triangle.
	 */
	public double area() {
		double perimeter = (this.a + this.b + this.c) / 2.0;
		return Math.sqrt(perimeter * (perimeter - this.a) * (perimeter - this.b) * (perimeter - this.c));
	}

	/**
	 * @return The perimeter of this triangle.
	 */
	public double perimeter() {
		return this.a + this.b + this.c;
	}

	@Override
	public String toString() {
		return String.format("Triangle with a=%.2f,b=%.2f,c=%.2f", this.a,
				this.b, this.c);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ShapeTriangle)) {
			return false;
		}
		ShapeTriangle other = (ShapeTriangle)obj;
		// CONSIDER: not very robust, but works for testing purposes. 
		return this.a == other.a && this.b == other.b && this.c == other.c;
	}

	@Override
	public int compareTo(ShapeTriangle o) {
		return (int) Math.signum(this.area() - o.area());
	}

}
