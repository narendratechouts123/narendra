package com.techouts.practice;
class country1{
	int no ;
	public String getCountry() {
		return "india";
	}
	country1(){
		no=12;
	}
}

class state   {
country1 c=new country1(); 
String statename;
state(String name){
	 
	statename=name;
}
public void get() {
	System.out.println(c.getCountry()+" "+c.no);
}

	
	
}
public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
state s=new state("Dachepalli");
s.get();
	}

}
