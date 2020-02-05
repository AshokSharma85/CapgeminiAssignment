package lab6;

import java.util.*;
import java.io.*;
public class Exercise7 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Enter the text file with proper extension: ");
		Scanner s=new Scanner(System.in);
		String filename=s.next();
		File f=new File(filename);
		boolean exist =f.exists();
			System.out.println("File exists: yes");
		
		boolean readable=f.canRead();
			System.out.println("Is this file readable: "+readable);
		
		boolean writable=f.canWrite();
			System.out.println("Is this file writeable: "+writable);
	
		long lengthoffile=f.length();
			System.out.println("Length of this file: "+lengthoffile);
			StringBuffer filetype=new StringBuffer();
	
		for(int i=filename.length()-1;i>=0;i--)
		{
			if(filename.charAt(i)=='.')
				break;
			filetype.append(filename.charAt(i));
		}
		filetype.reverse();
		System.out.println("File Type: ."+filetype);

	}

}
