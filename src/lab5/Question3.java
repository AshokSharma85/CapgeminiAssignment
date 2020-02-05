package lab5;

import java.util.Scanner;

public class Question3 {
	void primes(int n)
	{
		int t=2;
		int []arr=new int[n-1];//declaring the array which contain the element as 1 to n
		for(int i=0;i<n-1;i++)//
			arr[i]=t++;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]==0)
				continue;
			System.out.print(arr[i]+" ");//printing the prime number value 
			for(int j=i+1;j<n-1;j++)
			{
				if(arr[j]==0)
					continue;
				if(arr[j]%arr[i]==0)//setting the arr[i] value as 0 to the positions where the 
					arr[j]=0;//arr[i] divide a[j] completely
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the number upto n prime : ");
		n=s.nextInt();	
		System.out.println("Prime number upto n: ");
		
	
	Question3 obj=new Question3();
	obj.primes(n);
	s.close();
}
}
