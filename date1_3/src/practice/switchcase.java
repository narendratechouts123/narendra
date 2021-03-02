package practice;

import java.util.Scanner;

class pack{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void sub(int a,int b) {
		System.out.println(a-b);
	}public void div(int a,int b) {
		System.out.println(a/b);
	}public void mul(int a,int b) {
		System.out.println(a*b);
	}
	
}
public class switchcase {

	public static void main(String[] args) { 	
		
	 pack p=new pack();
	Scanner sc=new Scanner(System.in);
	int h=sc.nextInt();
		
		  int a=20,b=30;  
		  
		  switch(h) { case 1: p.add(a, b); break; case 2: p.sub(a, b); break; case 3:
		  p.mul(a, b);   case 4: p.div(a, b); break; default:
		  System.out.println("choose within 1 to 4");
		  
		  }
		 
	}

}
