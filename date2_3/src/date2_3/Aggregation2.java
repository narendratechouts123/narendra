package date2_3;

 
class Car extends Engine{
	String name;
	 Wheels w;
 
	Car(String s,Wheels w){
		name=s;
		this.w=w;
	}
	public void getdata() {
		if(name.equalsIgnoreCase("benz")) {
		System.out.println(name+"   engine name "+ name1+" no.of wheels"+w.no);

	}else if(name.equalsIgnoreCase("skoda")) {
		System.out.println(name+"   engine name "+ name2+" no.of wheels"+w.no);

	}
	}
}
class Engine {

	String name1="rolesrols";
	String name2="oyasis";
}
class Wheels{
	  int no;

	Wheels(int no){
		this.no=no;
	}
	
}
public class  Aggregation2 {

	public static void main(String[] args) {
	 Wheels wheel=new Wheels(5);
 Car car=new Car("benz",wheel);
 car.getdata();
 
	}

}
