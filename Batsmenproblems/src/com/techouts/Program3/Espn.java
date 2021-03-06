package com.techouts.Program3;

import java.util.Scanner;

public class Espn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batsman[] batsman=new Batsman[50];
	Batsman	batsman1=new Batsman("k",3000,23,34,333,33,21,22); 
	Batsman	batsman2=new Batsman("n",3001,22,32,232,553,521,222); 
	Batsman	batsman3=new Batsman("n1",3001,22,32,232,553,521,32); 

	 batsman[0]=batsman1;
	 batsman[1]=batsman2;
	 batsman[2]=batsman3;
	 Espncricinfo espn=new Espncricinfo();
	 espn.setBatsmans(batsman);

 Scanner sc=new Scanner(System.in);
 System.out.println("1.Total no.of playes\n 2.Display All Playes \n 3.Add BatsMen 4.updateStatistics\n 5.search");
 
 int no=espn.getNoOfBatsmen();
 espn.setTotal(no);
 for(int i1=0;i1<4;i1++) {
	 System.out.println("enter u r choice");
	 int ch=sc.nextInt();
 switch(ch){
	 
	 case 1:
		 System.out.println("total no.of batsmen are "+espn.getNoOfBatsmen());
	 break;
	 case 2:
		 Batsman[] bats=espn.getBatsmans();
		 System.out.println("name   runsScored centuries halfcenturies ballsfaced fours sixes id");
		 try {
	 for(int i=0;i<bats.length;i++) {
		 Batsman bt=bats[i];
		 System.out.println(bt.name+"      "+bt.runScored+"       "+bt.centuries+"              "+bt.halfCenturies+"        "+bt.ballsFaced+"      "+bt.fours+"    "+bt.sixes+"  "+bt.id);
		 
		 
		 
	 }
		 }catch(Exception e) {
			 break;
		 }
		 
	 case 3:
		int pid= espn.addBatsman(23," knr", 100, 100, 100, 1, 100, 100);
		System.out.println(pid+"is added");
		break;
		
	 case 4:
		Batsman bt= espn.updateBatsmanStats(23, 2000, 2000, 2000, 2000);
	 System.out.println("updated Values are");
	 System.out.println("name   runsScored centuries halfcenturies ballsfaced fours sixes id");

	 System.out.println(bt.name+"      "+bt.runScored+"       "+bt.centuries+"              "+bt.halfCenturies+"        "+bt.ballsFaced+"      "+bt.fours+"    "+bt.sixes+"  "+bt.id);
         break;
	 case 5:
		 System.out.println("enter search id");
		 int myid=sc.nextInt();
		 Batsman bt1=espn.getBatsmen(myid);
		 if(bt1==null) {
			 System.out.println("Batsman not avilble");
		 }else {
			 System.out.println("name   runsScored centuries halfcenturies ballsfaced fours sixes id");

			 System.out.println(bt1.name+"      "+bt1.runScored+"       "+bt1.centuries+"              "+bt1.halfCenturies+"        "+bt1.ballsFaced+"      "+bt1.fours+"    "+bt1.sixes+"  "+bt1.id);
		 }
		 break;
		
		 
		 
		 default:
			 System.out.println("enter correct option");
 }
 
 
	}
	}

}
