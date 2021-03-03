package Collections;

import java.util.*;

 
public class StacksandQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st=new Stack();
		st.push(3);
		st.push(23);
		st.push(12);
		st.push(32);
		System.out.println(st);
		st.pop();
		System.out.println(st);
 Queue q=new PriorityQueue();
q.add(22);
q.add(43);
q.add(233);
System.out.println(q);
q.remove();
System.out.println(q );
  
	}

}
