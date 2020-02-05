package lab6;

import java.io.*;
import java.util.*;

public class Exercise6 {
	public static void main(String[] args)throws IOException
	{
		FileReader fr=new FileReader("Sample.txt");
		
		int t=fr.read();
	
		int numOfchar=1;
		int numOfword=0;
		while(t!=-1)
		{
			if(t==(int)' '||t==(int)'\n')
			{
				numOfword++;
				t=fr.read();
				continue;
			}
			numOfchar++;
			t=fr.read();
		}
		
		BufferedReader br=new BufferedReader(new FileReader("Sample.txt"));
		String str=br.readLine();
		int numOfline=0;
		while(str!=null)
		{
			numOfline++;
			str=br.readLine();
		}
		System.out.println("In your text file, total number of character present: "+numOfchar);
		System.out.println("In your text file, total number of words present: "+numOfword+1);
		System.out.println("In your text file, total number of Line present: "+numOfline);
		
		br.close();
		fr.close();
	}

}
