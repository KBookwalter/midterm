package pkgShape;

public class Ellipse extends Circle {

	private double MinorRadius;
	
	public Ellipse(double radius, double minorRadius) {
		super(radius);
		if(minorRadius <= 0) {
			throw new IllegalArgumentException();
		}
		this.MinorRadius = minorRadius;	
	}
	
	@Override
	public double area() {
		return Math.PI * super.getRadius() * this.MinorRadius;
	}
	
	public double getMinorRadius() {
		return this.MinorRadius;
	}
	
	public void setMinorRadius(double minorRadius) {
		if(minorRadius <= 0) {
			throw new IllegalArgumentException();
		}
		this.MinorRadius = minorRadius;
	}
	
	public boolean isCircle() {
		return this.getMinorRadius() == super.getRadius();
	}
	
	public int compareTo(Shape s) {
		if(this.area() > s.area()) {
			return 1;
		}
		else if(this.area() < s.area()) {
			return -1;
		}
		else
			return 0;
	}

}
