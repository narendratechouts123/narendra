package abstraction;

import abstraction.b.Inab;

interface In{

	interface Inn{
		public void display();	
	}
	class Inner implements Inn{
		Inner(){
			System.out.println("ok");
		}

		@Override
		public void display() {
			System.out.println("in interface");
		}
	}
}

abstract class b implements In.Inn{
	interface InAbclass{
		public void display();
	}
	@Override
	public void display() {
		System.out.println("in abstract class");
		b.InAbclass inabclass=new Inab();
		 inabclass.display();
	}
	class Inab  implements b.InAbclass{

		@Override
		public void display() {
		 System.out.println("class in abstract class");
			
		}
		
		}
	
	 }
class a extends b  {
	 }
public class Abstractclass2 {
	static Boolean b=false;
	public static void main(String[] args) {
	 
In.Inner i=new In.Inner();
i.display();
 In.Inn i1=new a();
 i1.display();
 int a=12;
 
  System.out.println(!b);
	}

}
