package exercise4_6;

import junit.framework.TestCase;

/** <h1> TESTING CLASS </h1>
 * @author normal-pc
 *
 */
public class FoodTest extends TestCase {

public void testIceCream() {
	IFood iceCream = new IceCream ("Fritter",10,15,"sweet","sorbet");
	assertEquals(iceCream.unitPrice(),15/10d);
	assertTrue(iceCream.lowerPrice(1.8));
	assertFalse(iceCream.lowerPrice(1.0));
	assertFalse(iceCream.cheaperThan(new Coffee("Trung Nguyen",50,30,"Regular")));
	
}
public void testCoffee() {
	IFood coffee = new Coffee("Trung Nguyen",50,30,"Regular");
	assertEquals(coffee.unitPrice(), 30/50d);
	assertFalse(coffee.lowerPrice(0.5));
	assertTrue(coffee.lowerPrice(0.8));
	assertTrue(coffee.cheaperThan(new IceCream ("Fritter",10,15,"sweet","sorbet")));
}
public void testJuice () {
	IFood juice = new Juice("CoCa",100,35,"Sweet","Bottled");
	assertEquals(juice.unitPrice(), 35/100d);
	assertFalse(juice.lowerPrice(0.33));
	assertTrue(juice.lowerPrice(0.4));
	assertTrue(juice.cheaperThan(new Coffee("Trung Nguyen",50,30,"Regular")));
}

}
