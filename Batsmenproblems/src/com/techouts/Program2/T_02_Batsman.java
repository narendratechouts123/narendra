package com.techouts.Program2;

import java.util.Scanner;
 

public class T_02_Batsman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
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
		BatsMan b=new BatsMan(name,runs,centuries,halfs,balls,fours,sixes);
		b.setName(name);
		b.setRunScored(runs);
		b.setCenturies(centuries);
		b.setHalfCenturies(halfs);
		b.setBallsFaced(balls);
		b.setFours(fours);
		b.setSixes(sixes);
		System.out.println("NAME         "+b.getName());
		System.out.println("BALLS FACED   "+b.getRunScored());	
		System.out.println("Centuries    "+b.getCenturies());	
		System.out.println("HalfCenturies"+b.getHalfCenturies());	
		System.out.println("Fours"        + b.getFours());	
		System.out.println("Sixes        "+b.getSixes());	
		System.out.println("BallsFaced   "+b.getBallsFaced() );
	}

}
