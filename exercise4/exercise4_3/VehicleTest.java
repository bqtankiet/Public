package exercise4_3;

import junit.framework.TestCase;

public class VehicleTest extends TestCase {

	public void test() {
		// The bus
		Vehicle bus = new Bus("Blue",60,"LongBinh",33);
		Vehicle car = new Car("Red",4,"HatchBack",500);
		Vehicle limo = new Limo("Black",9,"Classic Vintage Limousine",10);
		Vehicle subway= new Subway("While",350,7,100);
	}
	
}
