package lab7;

import java.util.*;

public class Exercise8 {
	public int[] modifyArray(int[] arr,int size)
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=0;i<size;i++)
		{

			ts.add(arr[i]);
		}
		Iterator itr=ts.iterator();
		int i=0;
		while(itr.hasNext())
		{
			arr[i++]=(int)itr.next();
			
		}
		int []modifyarr = new int[i];
		for(int j=0;j<i;j++)
			modifyarr[j]=arr[j];
		return modifyarr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size=s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array elements: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		Exercise8 obj=new Exercise8();
		arr=obj.modifyArray(arr, size);
		System.out.println("Array after removing duplicates and in descending order: ");
		for(int i=arr.length - 1;i>=0;i--)
			System.out.print(arr[i]+" ");

	}

}
