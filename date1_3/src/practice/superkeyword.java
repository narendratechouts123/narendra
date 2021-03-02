package practice;

import java.io.Serializable;

class pare  {
	int a;
	int b;
	 
	pare(int a,int b){
		this.a=a;
		this.b=b;
	}
	
}
class chi  extends pare{
	 
	 
 
	 
	  chi(int a, int b) { 
		  super(a,b); // TODO Auto-generated constructor stub }
	  }
	  
	  public void get(){ System.out.println("child"+super.a) ; }
	 
	
}
public class superkeyword {

	public static void main(String[] args) {
 
 chi c=new chi(2,4);
 c.get();
	}

}
