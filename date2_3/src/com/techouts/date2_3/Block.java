package com.techouts.date2_3;
class BB{
	BB(){
		System.out.println("Constructor");
	}
	static int a ;
	{
		System.out.println("non static block");
	}
	static{
		a=123;
		System.out.println("static hiio");
	}
	
	
	
}
public class Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BB b=new BB();
System.out.println(b.a);
	}

}
