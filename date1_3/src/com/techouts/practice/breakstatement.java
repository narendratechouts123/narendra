package com.techouts.practice;

import java.util.Iterator;

public class breakstatement {

	public static void main(String[] args) {
 		
		int ch=65;
		
		for (int i = 0; i < 26; i++) {
			if((ch+i)==85) {
			
			 continue;
		
			}
			System.out.print ((char)(ch+i));
	 
		}

	}

}
