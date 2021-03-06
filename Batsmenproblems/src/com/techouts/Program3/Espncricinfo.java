package com.techouts.Program3;

public class Espncricinfo {
  private final int SIZE=50;
   private Batsman[] batsman;
   private int noofBatsmen;
   
  
   
   
	   public Batsman[] getBatsmans()
	   {
		   noofBatsmen=this.getNoOfBatsmen();
		   
		   return batsman ; 
		   }
	  

public void setBatsmans(Batsman[] batsmans) {
	this.batsman  = batsmans;
}

 
   
   public int getNoOfBatsmen() {
	   int count=0;
	   try {
	   for(int i=0;i<batsman .length;i++) {
		   Batsman b=batsman[i];
		 int  no=b.id;
		   if(no>0) {
			   count++;
		   }else {
			   break;
		   }
	   }
	   }catch(Exception e) {
		   return count; 
	   }
	   return count;
	 
   }
	
	  public int addBatsman(int id,String name,int runScored,int centuries,int  halfCenturies,int ballsFaced,int fours,int sixes) {
	  
		  noofBatsmen=this.getNoOfBatsmen();
		  System.out.println("before"+noofBatsmen);
	  System.out.println(this.noofBatsmen);
		  if(this.noofBatsmen<SIZE) {
			  
			  Batsman b1=new Batsman(name, runScored, centuries, halfCenturies, ballsFaced, fours, sixes, id);
			  this.batsman[this.noofBatsmen ]=b1;
			  noofBatsmen=this.getNoOfBatsmen();
			  System.out.println("after"+noofBatsmen);
			  return id;
		  }
		  
		  
		  
		  
		  
		  return 0;
	  
	  
	  }
	  
	 
	
	  public Batsman updateBatsmanStats(int id,int runScored,int fours,int sixes,int ballsFaced)
	  
	  
	  { 
		  for(int i=0;i<this.noofBatsmen;i++) {
			  Batsman bt=batsman[i];
			  if(bt.id==id) {
				  bt.runScored=runScored;
				  bt.fours=fours;
				  bt.sixes=sixes;
				  bt.ballsFaced=ballsFaced;
				  
				  return bt;
		  }
	  
	           
	  
	              }
		  return null;
	  }


	  public Batsman getBatsmen(int id)
	  
	  
	  { 
		  int status=0;
		  System.out.println(this.noofBatsmen);
		  for(int i=0;i<this.noofBatsmen;i++) {
			  Batsman bt=batsman[i];
			  if(bt.id==id) {
				 status=1;
				  
				  
		  }
			  if(status==1) {
				  return  bt;
			  }
	           
	  
	              }
		  
		  return null;
	  }


	public void setTotal(int no) {
		 this.noofBatsmen=no;
	}
	 
	  
	   
		 


		 
}
