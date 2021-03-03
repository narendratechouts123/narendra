package abstraction;
interface  Operation{
	public void add(double first,double second);
}
class Add implements Operation{

	@Override
	public void add(double first, double second) {
		 System.out.println(first+second);
		
	}
	
}
class Substraction implements Operation{

	@Override
	public void add(double first, double second) {
		// TODO Auto-generated method stub
		System.out.println(first-second);
	}
	
}

public class Interfaces1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation operation=new Substraction();
		operation.add(30, 20);

	}

}
