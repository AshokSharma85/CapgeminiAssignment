package lab5;

import java.util.Scanner;

public class Question2 {
	 int fibbwithrecursion(int n)
	{
		if(n==0 || n==1)
			return n;
		return fibbwithrecursion(n-1)+fibbwithrecursion(n-2);
	}
	 void fibbwithoutrecursion(int n)
	 {
		 int first=0;
		 int second=1;
		 int third;
		 System.out.println(" ");
		 System.out.print(first+" "+second+" ");
		 for(int i=2;i<=n;i++)
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
		int n;
		System.out.println("Enter the number upto n Fibbonaci: ");
		n=s.nextInt();
		Question2 obj=new Question2();
		for(int i=0;i<=n;i++)
		System.out.print(obj.fibbwithrecursion(i)+" ");
		obj.fibbwithoutrecursion(n);
		s.close();
	}

}
