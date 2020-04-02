package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Ellipsoid;

class EllipsoidTest {

	@Test
	void EllipsoidTest() {
		Ellipsoid e = new Ellipsoid(10, 20, 25);
		assertEquals(20943.95, e.volume(), 0.01);
	}

}
