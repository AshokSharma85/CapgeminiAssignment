package lab5;

import java.util.Scanner;

class Checkstring extends Exception{
	String message;
	
	Checkstring(String message)
	{
	 this.message=message;
	 System.err.println(message);
	}
}
class Check {
	public static void checkthis(String fName,String lName) throws Checkstring
	{
		try
		{
		if(fName.isEmpty())
		{
			throw new Checkstring("First Name  is Empty");
		}
		else if(lName.isEmpty()){
			throw new Checkstring("Last Name is Empty");
		}
		else
		{
			System.out.println("Good to go");
		}
		}
		catch(Exception e)
		{
			System.out.println("oops!!Something is wrong \n"
					+ "Please Enter Correct Details");
	}
	}
	
}
public class Question4 {

	public static void main(String[] args) throws Checkstring {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		String fName=sc.nextLine();
		System.out.println("Enter Last Name");
		String lName=sc.nextLine();
		sc.close();
		Check.checkthis(fName,lName);

	}

}
