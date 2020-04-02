package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Ellipse;

class EllipseTest {

	@Test
	void EllipseTest() {
		Ellipse e = new Ellipse(10, 20);
		assertEquals(628.32, e.area(), 0.01);
	}

}
