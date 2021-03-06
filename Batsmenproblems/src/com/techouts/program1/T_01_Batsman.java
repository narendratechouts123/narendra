package com.techouts.program1;

import java.util.Scanner;

class BatsMan {
String name;
int runScored;
int centuries;
int halfCenturies;
int ballsFaced;
int fours;
int sixes;
 public  void setData(String name,int runScored,int centuries,int halfCenturies,int ballsFaced,int fours,int sixes) {
	this.name=name;
	this.runScored=runScored;
	this.centuries=centuries;
	this.halfCenturies=halfCenturies;
	this.ballsFaced= ballsFaced;
	this.fours=fours;
	this.sixes=sixes;
}
public float getStrikeRate() {
	
	return (this.runScored*100)/ballsFaced;
}
public int getRunsScoredInBoundaries() {
	
	return ( 4 * fours + 6 * sixes );
}
}


public class T_01_Batsman{
	public static void main(String[] args) {
		BatsMan b=new BatsMan();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("No.Of runs");

		int runs=sc.nextInt();
		System.out.println("Enter No.of Centuries");

		int centuries=sc.nextInt();
		System.out.println("Enter No.Of HalfCenturies");

		int halfs=sc.nextInt();
		System.out.println("Enter No.of balls");

		int balls=sc.nextInt();
		System.out.println("Enter no.of Fours");
		int fours=sc.nextInt();
		System.out.println("Enter no.of Sixes");
		int sixes=sc.nextInt();
		b.setData(name, runs, centuries, halfs, balls, fours, sixes);
		System.out.println("The Strikerate of    "+b.name +"    is");
		System.out.println(b.getStrikeRate());
		System.out.println("the runs made by boundaries made by  "+b.name+"  is");
		System.out.println(b.getRunsScoredInBoundaries());
	}
	
	
	
	
	
	
}
