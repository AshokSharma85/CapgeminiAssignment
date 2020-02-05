package lab5;

import java.util.Scanner;

public class Question2 {
	//finding fibonacci Series with Recursion
	 int fibbwithrecursion(int input)
	{
		if(input==0 || input==1)
			return input;
		return fibbwithrecursion(input-1)+fibbwithrecursion(input-2);
	}
	 
	//finding fibonacci Series without Recursion
	 
	 void fibbwithoutrecursion(int input)
	 {
		 int first=0;
		 int second=1;
		 //to store sum of last two value
		 int third;
		 System.out.println(" ");
		 System.out.print(first+" "+second+" ");
		 for(int i=2;i<input;i++)
		 {
			 third=first+second;
			 first=second;
			 second=third;
			 System.out.print(third+" ");
		 }
	 }
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number upto n Fibbonaci: ");
		int number=s.nextInt();
		Question2 obj=new Question2();
		for(int i=0;i<number;i++)
		System.out.print(obj.fibbwithrecursion(i)+" ");
		obj.fibbwithoutrecursion(number);
		s.close();
	}

}
