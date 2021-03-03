package abstraction;

import java.util.logging.Logger;

interface Car{
	int WHEELS=4;
	public void engine();
}

interface Truck{
	int WHEELS=12;
	public void engine();
	
}
class Ford implements Car,Truck{

	@Override
	public void engine() {
		System.out.println("color is blue");
		 
	}

	
	
}
class Benz implements Truck{

	@Override
	public void engine() {
 		System.out.println("Benz truck color is Red");
	}
	
}
public class Interfaces2 {

	public static void main(String[] args) {
	 Truck f=new   Benz();
  System.out.println("the no.of Wheels are  "+Truck.WHEELS);
 	 
	 f.engine();

	}

}
