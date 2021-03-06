package com.techouts.date2_3;
class Parent{
	 int a;
	 int b;
	 Parent(){
		 
	 }
	Parent(int a,int b){
		 
		this.a=a;
		this.b=b;
	}
	public void knr() {
		System.out.println(a+b);
	}
}
class Child extends Parent{
     
	Child(int a, int b) {
		super(a,b );
		 
	}
	
}
public class Superkeyword {

	public static void main(String[] args) {
		 
Child c=new Child(2,3);
c.knr();
	}

}
