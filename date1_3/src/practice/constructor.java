package practice;
class ab{
	int c,d;
    ab(){
    	c=10;
    	d=20;


	}
	
}
public class constructor {
	int a,b;
	constructor(int a,int b){
		this.a=a;
		this.b=b;
	} 
	public void display() {
		System.out.println(a+"   "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ab  c=new ab( ); 
//c.display();//
System.out.println(c.c+c.d);	

	}

}
