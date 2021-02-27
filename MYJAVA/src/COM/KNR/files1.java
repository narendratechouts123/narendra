package COM.KNR;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.stream.FileCacheImageOutputStream;

public class files1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter firstname");
int no1=sc.nextInt();
System.out.println("enter secondname");
int no2=sc.nextInt();
File f=new File("d:\\addition.txt");
String s=" addition"+"\n "+(no2+no1);
char ch[]=s.toCharArray();
FileOutputStream fos=new FileOutputStream(f,true);
 byte[] b=s.getBytes();
 fos.write(b);
 fos.flush();
	}

}
