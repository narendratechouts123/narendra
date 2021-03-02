package date2_3;
class country{
	int code;
	String name;
	int rank;
	country(){
		
	}
	country(int code,String name,int rank){
		this. code=code;
	this.	name=name;
	this.	rank=rank;
	}
	 
}
class address{
	int no;
	String name;
 country c;
	
	address(){
		
	}
	public address(int no, String name,country c1 ) {
	 c=c1;
		this.no = no;
		this.name = name;
		 
	}
	
	
	
	
}
public class composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
country c1=new country(3,"india",23);
address ad=new address(3,"ap",c1);
 System.out.println(ad.c.name+" "+ad.name);
	}

}
