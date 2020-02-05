package lab5;

import java.util.Scanner;

public class Question3 {
	void primes(int n)
	{
		int t=2;
		//declaring the array which contain the size with n-1
		int []arr=new int[n-1];
		for(int i=0;i<n-1;i++)//
			arr[i]=t++;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]==0)
				continue;
			//if any print the prime number 
			System.out.print(arr[i]+" "); 
			for(int j=i+1;j<n-1;j++)
			{
				if(arr[j]==0)
					continue;
				//setting the arr[i] value as 0 to the positions where the arr[i] divide a[j] completely
				if(arr[j]%arr[i]==0) 
					arr[j]=0;
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto n prime : ");
		int input=sc.nextInt();	
		System.out.println("Prime number upto n: ");
		
	
		Question3 obj=new Question3();
		obj.primes(input);
		sc.close();
}
}
