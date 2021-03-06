package com.techouts.abstraction;

import java.util.Scanner;

interface Areas{
	int LENGTH=10;
	int BREADTH=20;
	int HEIGHT=10;
	int RADIUS=10;
	double PI=3.14;
	public void area();
}
class Circle implements Areas{
double area;
	@Override
	public void area() {
	 
		area=Areas.PI*Math.pow(Areas.RADIUS, 2);
		System.out.println("area of circle is"+area);
	}
	
}
class Square implements Areas{
double area;
	@Override
	public void area() {
 
		area=Math.pow(Areas.BREADTH, 2);
		System.out.println("area for square is"+area);
	}
	
}class Cube implements Areas{
double area;
	@Override
	public void area() {
	 
		area=Areas.LENGTH*Areas.BREADTH*Areas.HEIGHT;
		System.out.println("area for cube is"+area);
	}
	
}
public class Area {
 
	public static void main(String[] args) {
		Areas area=null;
		Scanner sc=new Scanner(System.in);
	 System.out.println("1.square\n2.circle\n3.cube");
	 int choice=sc.nextInt();
	 if(choice==1) {
		 area=new Square();
	 }
	 if(choice==2) {
		 area=new  Circle();
	 }if(choice==3) {
		 area=new Cube();
	 }
area.area();
	}

}
