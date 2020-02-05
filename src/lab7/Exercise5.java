package lab7;

import java.util.ArrayList;
import java.util.*;

public class Exercise5 {
	public int getSecondSmallest(int []arr,int size)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<size;i++)
		{
			al.add(arr[i]);
		}
		Collections.sort(al);
		return al.get(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = s.nextInt();
		int []arr=new int[size];
		System.out.println("Enter Array element: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		Exercise5 obj = new Exercise5();
		System.out.println("Your Second Smallest Element is: ");
		System.out.println(obj.getSecondSmallest(arr, size));
		s.close();
	}

}
