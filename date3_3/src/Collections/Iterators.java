package Collections;
 

import java.util.*;

public class Iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List al=new ArrayList();
		al.add(2);
		al.add(5);
		al.add(6);
 		 Iterator it= al.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		 
		 al.forEach((x)-> 
			 System.out.println((Integer)x*2)
		  );
		 
		 

	}

}
