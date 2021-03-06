package com.techouts.date2_3;
 final class Parent1{//cannot inherited
	final int a=123;//cannot updatable
	  void display() {
		System.out.println("ok");
	}
	final  Parent1(){//cannot
		  System.out.println("final constructor");
	  }
}
class Child1 extends  Parent1{
	final  void display() {//cannot override
	a++;	 
	 }
	
}
public class Final {

	public static void main(String[] args) {
		Child1 c=new Child1();
 
	}

}
