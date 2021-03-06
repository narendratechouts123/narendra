package com.techouts.practice;
class parent12{
	int a=123;
}
class child123 extends parent12{
	
}
class child213 extends child123{
	
}
public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child213 c2=new child213();
		System.out.println(c2.a);

	}

}
