package lab7;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercise3 {
	public LinkedHashMap<Integer,Integer> getSquares(LinkedList<Integer>list,int size)
	{ 
		LinkedHashMap<Integer, Integer>hmap=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<size;i++)
		{
			int n=list.get(i);
			int sq=n*n;
			if(hmap.containsKey(n))
				continue;
			else
			{
				hmap.put(n,sq);
			}
		}
		return hmap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of your list: ");
		int size=s.nextInt();
		System.out.println("Enter your List Element: ");
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<size;i++)
		{
			int inp=s.nextInt();
			list.add(inp);
		}
		Exercise3 obj = new Exercise3();
		System.out.println("Square of your number: ");
		System.out.println(obj.getSquares(list,size));
	}

}
