package exercise4_7;

import junit.framework.TestCase;

public class TaxiVehicleTest extends TestCase {

	public void testCab() {
		ITaxiVehicle cab = new Cab(16,3,5);
		assertEquals(cab.getFare(3000),5*3000d);
		assertTrue(cab.lowerPrice(6*3000,3000));
		assertFalse(cab.lowerPrice(4*3000,3000));
		assertTrue(cab.cheaperThan(new Limo(03,5,35,50),3000));
		assertFalse(cab.cheaperThan(new Cab(16,3,3),3000));
	}
	
	
	public void testLimo() {
		ITaxiVehicle limo = new Limo(03,5,35,50);
		assertEquals(limo.getFare(6000),35*6000+50d);
		assertTrue(limo.lowerPrice(35*6000+100d,6000));
		assertFalse(limo.lowerPrice(4*3000,6000));
		assertTrue(limo.cheaperThan(new Limo(03,5,35,51),6000));
		assertFalse(limo.cheaperThan(new Cab(16,3,3),3000));
	}
	
	public void testVan() {
		ITaxiVehicle van = new Van(33,7,10,1, true);
		assertEquals(van.getFare(3000),10*3000d+7*1);
		assertTrue(van.lowerPrice(10*3000d+7*2,3000));
		assertFalse(van.lowerPrice(4*3000,3000));
		assertTrue(van.cheaperThan(new Limo(03,5,35,50),3000));
		assertFalse(van.cheaperThan(new Cab(16,3,3),3000));
	}
	
}
