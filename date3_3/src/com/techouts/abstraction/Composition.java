package com.techouts.abstraction;

import java.util.ArrayList;
import java.util.List;

class University{
	public void display() {
		System.out.println("anu");
	}
	String name;
	List clg;
	University(){
		
	}
	public University(String string, List college) {
		 name=string;
		 clg=college;
		 
	}

	public void display_colleges() {
		System.out.println("university is"+name);
		 for (Object object : clg) {
			 Colleges clg=(Colleges)object;
			System.out.println(clg.name+"     "+clg.code);
		}
	}
	
	
}

class Colleges{
	University uni =new University();
  
	 public void diaplay() {
		 uni.display();
	 }
	String name;
	String code;
	Colleges(String name,String code){
		this.name=name;
		this.code=code;
	}
	
	
	
}
public class Composition {

	public static void main(String[] args) {
		
		  Colleges college1=new Colleges("abc","s123"); Colleges college2=new
		  Colleges("abc1","s124"); List<Colleges> lt=new ArrayList(); lt.add(college1);
		  lt.add(college2);
		 
University un=new University("Anu",lt);
 
un.display_colleges();
un.display();
	}

}

