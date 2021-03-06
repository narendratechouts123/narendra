package com.techouts.collections;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
 
public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add(3);
		v.add(2);
		 Enumeration en=v.elements();
		 while(en.hasMoreElements()) {
			 System.out.println(en.nextElement());
		 }
		 Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		 ht.put(1, "knr");
		 System.out.println(ht.get(1));
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
		String d1=s.format(d);
		System.out.println(d1);
 	}

}
