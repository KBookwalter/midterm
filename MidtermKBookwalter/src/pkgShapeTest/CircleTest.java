package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Circle;

class CircleTest {

	@Test
	void CircleTest() {
		Circle c = new Circle(10);
		assertEquals(314.15, c.area(), 0.01);
	}
	
	

}
