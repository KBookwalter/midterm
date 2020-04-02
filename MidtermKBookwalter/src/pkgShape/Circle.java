package pkgShape;

public class Circle extends Shape{

	private double Radius;
	
	public Circle(double radius) {
		
		if(radius <= 0) {
			throw new IllegalArgumentException();
		}
		
		
		this.Radius = radius;
	}
	@Override
	public double area() {
		return Math.PI * Math.pow(this.Radius, 2);
	}
	
	public double getRadius() {
		return this.Radius;
	}
	
	public void setRadius(double radius) {
		if(radius <= 0) {
			throw new IllegalArgumentException();
		}
		this.Radius = radius;
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
