package com.techouts.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List l=new ArrayList();
     System.out.println(l.size());
     l.add(43);
     l.add( 104);
     l.add(22);
      System.out.println(l);
      System.out.println(l.get(2));
      Collections.sort(l);
      System.out.println(l);
      List list1=new ArrayList(l);
      System.out.println(list1);
	}

}
