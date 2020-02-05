package lab6;

import java.util.Scanner;

public class Exercise10 {
	public static boolean checkString(String str)
	{
		int size=str.length();
		if(str.charAt(size-1)=='b' && str.charAt(size-2)=='o' && str.charAt(size-3)=='j' && size>=11)
		{
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {

		 System.out.println("Enter Your Input");
	      Scanner sc=new Scanner(System.in);
	      String str=sc.next();
	      System.out.println(checkString(str));

	}

}
