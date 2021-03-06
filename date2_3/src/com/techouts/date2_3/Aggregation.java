package com.techouts.date2_3;
class Country1{
	int no ;
	  String country="india";
	public String getCountry() {
		return country;
	}
	Country1(){
		no=12;
	}
 
}

class State   {
Country1 c=new Country1(); 
String statename;
State(String name){
	 
	statename=name;
}
public void get() {
	 System.out.println(c.getCountry()+" "+c.no);
}

	
	
}
public class Aggregation {
	
	public static void main(String[] args) {
 
State state=new State("Dachepalli");
state.get();
 
 
	}

}
