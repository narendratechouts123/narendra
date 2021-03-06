package com.techouts.date2_3;
  class Pare{//no static class
	static int no=12;
	
	{
		no=no+30;	
	}
	static int getVal() {
		System.out.println("parent");
		return 32;
	}

}
class Chil extends Pare{
	{
		System.out.println(no+1);
	}
	 
	static int getVal() {
		System.out.println("from child");
		return 10;
	}
}


public class Staticelements {

	public static void main(String[] args) {
		 Pare p=new Chil();
System.out.println(p.getVal());

	}

}
