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
 
File f=new File("d:\\addition.txt");
String s=" addition"+"\n"+( 2+ 1);
 FileOutputStream fos=new FileOutputStream(f,true);
 byte[] b=s.getBytes();
  fos.write(13);
 fos.write(b);
 fos.flush();
	}

}
