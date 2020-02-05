package lab5;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
boolean b=true;

try 
{
	while(b)
	{ 
	System.out.println("Enter Your Input");
	String input=sc.next();
	switch(input)
	{
	case "red":
	    System.out.println("STOP");
	    break;
	case "green":
		System.out.println("Go");
		break;
	case "yellow":
		System.out.println("Go carefully");
	    break;
	case "exit":
		b=false;
		
	}
	sc.close();
}
}
catch(Exception e)
{
	System.out.println("Please Enter Valid Input");
}


	}

}
