package com.techouts.abstraction;
abstract class Bank{
	
	public void displayBank() {
		System.out.println("SBI");
	}
	public abstract void accountName(int no);
}

class AccountNo extends Bank{

	@Override
	public void accountName(int no) {
		 System.out.println("account name is"+no);
	}
	
}
public class AbsrctClass {

	public static void main(String[] args) {
	 
		Bank b=new AccountNo( );
		b.displayBank();
		b.accountName(123456);
	 
		 

	}

}
