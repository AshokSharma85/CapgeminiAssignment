package lab7;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Exercise2 {
	public HashMap<String, Integer>countCharater(char []arr,int size)
	{
		LinkedHashMap<String,Integer> hmap=new LinkedHashMap<String,Integer>();
		for(int i=0;i<size;i++)
		{
			int value;
			String s="";
			 s=s+arr[i];
			if(hmap.containsKey(s)) 
			{
				  value=hmap.get(s);
				  value++;
				  hmap.put(s,value);
				  continue;
			}
			hmap.put(s,1);
		}
		return hmap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr your String: ");
		String str=s.next();
		char []arr=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i);
		}
		Exercise2 obj=new Exercise2();
		System.out.println("Your Frequency hashmap: ");
		System.out.println(obj.countCharater(arr, str.length()));
		s.close();
	}

}
