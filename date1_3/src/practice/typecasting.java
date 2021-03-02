package practice;

public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20;

  byte b=(byte)a; System.out.println(b);
  
  byte b1=23; b1=(byte)(b1+b); System.out.println(b1); short s=12; short s1=20;
  s1=(short)(s+s1); System.out.println(s1);
 
double d=12;
a=(int)d;
System.out.println(a);
int ab=a+(int)d;
System.out.println(ab);
long l=22;
float f=l;
   l=(long)f;
System.out.println(f);
	}

}
