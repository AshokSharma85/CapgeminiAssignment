package lab6;

import java.util.Scanner;

public class Exercise8 {

	public static boolean checkString(String str)
	{
		for(int i=0;i<str.length()-1;i++)
		{   int first=(int)str.charAt(i);
		    int second=(int)str.charAt(i+1);
			if(first<=second)
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		 System.out.println("Enter Your Input");
	      Scanner sc=new Scanner(System.in);
	      String str=sc.next();
	      System.out.println(checkString(str));

	}

}
