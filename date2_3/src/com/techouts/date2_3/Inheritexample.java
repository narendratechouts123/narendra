package com.techouts.date2_3;
class A{
	static int a=123;
}
class B extends A{
	int b=1234;
	{
	super.a=a+1;
	}
}
public class Inheritexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B a=new B();
 B b=(B)a;

System.out.println(a instanceof A);
 System.out.println(b.a+"  "+b.b);
	}

}
