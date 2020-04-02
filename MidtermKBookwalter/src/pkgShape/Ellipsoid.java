package pkgShape;

public class Ellipsoid extends Ellipse {
	private double HeightRadius;

	public Ellipsoid(double radius, double minorRadius, double heightRadius) {
		super(radius, minorRadius);
		if(heightRadius <= 0) {
			throw new IllegalArgumentException();
		}
		this.HeightRadius = heightRadius;
	}

	public double volume() {
		return (4 * Math.PI * super.getMinorRadius() * super.getRadius() * this.HeightRadius) / 3;

	}

	public int compareTo(Shape s) {
		if(super.area() > s.area()) {
			return 1;
		}
		else if(super.area() < s.area()) {
			return -1;
		}
		else
			return 0;
	}
}


