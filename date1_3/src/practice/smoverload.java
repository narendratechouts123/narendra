package practice;
class overload{
	   public static void st() {
		   System.out.println("parent");
	   }
	   public void nst() {
		   System.out.println("parent");
	   }
}
class overload1 extends overload{
	 
	   public static void st() {
		   System.out.println("child");
	   }
	@Override
	   public void nst() {
		   System.out.println("child");
	   }
}
public class smoverload {

	public static void main(String[] args) {
		 overload o=new overload() ;
		 overload o1=new overload1() ;
 o.st();
 o1.st();
 o.nst();
 o1.nst();
	}

}
