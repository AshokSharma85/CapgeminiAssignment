package lab6;

import java.util.Scanner;

public class Exercise3 {
	
	public static String getImage(String str)
	{     
		String result =str+"|";
       //System.out.println(str.length());	
		for(int  i=str.length()-1;i>=0;i--)
		{
			result=result+str.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter Your Input");
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      System.out.println(getImage(str));
    	  
	}

}
