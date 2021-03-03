package abstraction;

import java.util.logging.Logger;

interface Book{
 	public void bookName();
}

interface Author extends Book{
	public void authorName();
}

  class HarryPotter implements Author{

	@Override
	public void bookName() {
		 System.out.println("part 2");
		
	}

	@Override
	public void authorName() {
	 System.out.println("rollin");
		
	}
	
}
public class InterfaceInheritance {

	public static void main(String[] args) {
		  Author author=new HarryPotter();
		  author.bookName();
		  author.authorName();
		 
 
	}

}
