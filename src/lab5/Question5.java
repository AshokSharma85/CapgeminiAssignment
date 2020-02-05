package lab5;

import java.util.Scanner;

class Age extends Exception{
	String message;
	Age(String message)
	{
		this.message=message;
		System.err.println(message);
	}
}
class CheckAge {
	public static void checkThis(int inputForAge) throws Age 
	{
		try
		{
		if(inputForAge<=15)
		{
			throw new Age("You are below 15");
		}
		else
		{
			System.out.println("You Are above 15");
		}
		}
		catch(Exception e)
		{
			System.out.println("oops!!Something is wrong \n"
					+ "Please Provide Correct Details");
	}
	}
}
public class Question5 {

	public static void main(String[] args) throws Age {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        int input=sc.nextInt();
		CheckAge.checkThis(input);
		sc.close();
		
	}

}
