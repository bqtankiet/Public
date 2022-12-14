package exercise4_4;

import junit.framework.TestCase;

public class ShapeTest extends TestCase {

	public void testDotShape() {
		//test constructor
		IShape dot = new Dot(new CartPt(5, 4));
		//test method
		assertEquals(dot.area(),0.0);
		assertEquals(dot.distanceToO(),Math.sqrt(5*5+4*4));
		assertTrue(dot.contains(new CartPt(5,4)));
		assertFalse(dot.contains(new CartPt(4,4)));
		assertEquals(dot.boundingBox(),new Rectangle(new CartPt(5, 4),0,0));
	}

	public void testCircleShape() {
		//test constructor
		IShape circle = new Circle(new CartPt(3, 5), 2);
		//test method
		assertEquals(circle.area(),2*2*Math.PI);
		assertEquals(circle.distanceToO(),Math.sqrt(3*3+5*5));
		assertTrue(circle.contains(new CartPt(3,3)));
		assertTrue(circle.contains(new CartPt(5,5)));
		assertFalse(circle.contains(new CartPt(6,5)));
		assertEquals(circle.boundingBox(),new Rectangle(new CartPt(1, 3),4,4));
	}

	public void testSquareShape() {
		//test constructor
		IShape square = new Square(new CartPt(8, 6), 3);
		//test method
		assertEquals(square.area(),9.0);
		assertEquals(square.distanceToO(),Math.sqrt(8*8+6*6));
		assertTrue(square.contains(new CartPt(8,6)));
		assertFalse(square.contains(new CartPt(12,9)));
		assertEquals(square.boundingBox(),new Rectangle(new CartPt(8, 6),3,3));

	}

	public void testRectangle() {
		//test constructor
		IShape rectangle = new Rectangle(new CartPt(5, 4), 3, 4);
		//test method
		assertEquals(rectangle.area(),12.0);
		assertEquals(rectangle.distanceToO(),Math.sqrt(5*5+4*4));
		assertTrue(rectangle.contains(new CartPt(7,5)));
		assertFalse(rectangle.contains(new CartPt(3,3)));
		assertEquals(rectangle.boundingBox(),new Rectangle(new CartPt(5, 4),3,4));

	}

}
