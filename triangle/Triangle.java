package triangle;

public class Triangle {
	private double x;
	private double y;
	private double z;

	public Triangle(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public TriangleTypeEnum getType() {
		if (x == y && y == z)
			return TriangleTypeEnum.EQUILATERAL;
		else if (x == y || y == z || z == x)
			return TriangleTypeEnum.ISOSCELES;
		else
			return TriangleTypeEnum.SCALENE;
	}

	public static void main(String[] args) {
		Triangle t = new Triangle(4, 3.5, 5);
		System.out.println(t.getType());
	}
}
