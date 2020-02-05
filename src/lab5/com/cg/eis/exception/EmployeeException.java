package lab5.com.cg.eis.exception;

import java.util.Scanner;


class Emp extends Exception{
	String message;
	Emp(String message)
	{
		this.message=message;
		System.err.println(message);
	}
}
class CheckSalary {
	public static void checkThis(int inputForSalary) throws Emp 
	{
		try {
		if(inputForSalary<=3000)
		{
			throw new Emp("Your salary is below 3000");
		}
		else
		{
			System.out.println("Your salary is above 3000");
		}
		}
		catch(Exception e)
		{
			System.out.println("oops!!Something is wrong \n"
					+ "Please Provide Correct Details");
	}
	}
}
public class EmployeeException {

	public static void main(String args[]) throws Emp
	{  Scanner sc=new Scanner(System.in);
       System.out.println("Please Enter Your Salary");
       int input=sc.nextInt();
	   CheckSalary.checkThis(input);
	   sc.close();
	}
}
