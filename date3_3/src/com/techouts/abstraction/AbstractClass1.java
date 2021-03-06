package com.techouts.abstraction;
abstract class Constructorcla{
	int rollno;
	String cls;
	 Constructorcla(){
		 
	 }
	public Constructorcla(int rollno, String cls) {
		 
		this.rollno = rollno;
		this.cls = cls;
	}
	public void details() {
		System.out.println(this.rollno+" "+this.cls);
	}
	
	
	
	
	
}
class Child extends Constructorcla{
 
	public Child(int rollno, String cls) {
		super(rollno, cls);
		 
	}
	public Child() {
		// TODO Auto-generated constructor stub
	}
	public void display(Constructorcla con) {
		System.out.println(con.cls+" "+con.rollno);
	}

	
}

public class AbstractClass1 {

	public static void main(String[] args) {
	 Constructorcla con=new Child(23,"mca");
	 con.details();
	 new Child().display(con);

	}

}
