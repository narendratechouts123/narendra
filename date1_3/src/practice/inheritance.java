package practice;
class parent{
	int a1=123;
}
class child extends parent{
	
	
}
class child1 extends parent{
	
}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	parent p=  new child1();
	child1 c=(child1)p;
	System.out.println(c.a1); 

	}

}
