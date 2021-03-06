package com.techouts.date2_3;

import java.util.ArrayList;
import java.util.List;

class Student{
	int no;
	String name;
	public Student(int no, String name) {

		this.no = no;
		this.name = name;
	}
	
	
}
class course{
	static int no=0;
	String cname;
	List<Student> st;
	course(String name,List lt){
		st=lt;
		cname=name;
	}
	public void getdata() {
		System.out.println(cname);
		System.out.println("----------------------------");
		System.out.println("name"+"     "+"number");
		for(Student st:st) {
			Student st1=st;
			
			System.out.println(st.name+"    "+st.no);
			no++;
		}
		
	}
	public void count() {
		System.out.println("the total no.of students are"+no);
	}
	
	
}
public class aggregation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student(1,"knr");
		Student st1=new Student(2,"knr1");
		Student mc=new Student(1,"knr2");
		Student mc1=new Student(2,"knr3");
		List<Student> stucse=new ArrayList();
		stucse.add(st);
		stucse.add(st1);
		List<Student> stumca=new ArrayList();
		stumca.add(mc );
		stumca.add(mc1);
		course c=new course("cse",stucse);
		c.getdata();
		course c1=new course("mca",stumca);
		c1.getdata();
		 c.count( );
		

	}

}
