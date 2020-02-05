package lab7;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercise1 {
	public LinkedList<Integer> getValues(HashMap<Integer, Integer> hm,int size)
	{
		LinkedList<Integer>list=new LinkedList<Integer>();
			list.addAll(hm.values());
			
	 Collections.sort(list);
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		System.out.println("Enter the size of the HashMap: ");
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the "+(i+1)+" pair");
			int key=s.nextInt();
			int value=s.nextInt();
			
			hm.put(key, value);
		}
		Exercise1 obj=new Exercise1();
		System.out.println("All values of your HashMap  in sorted order: ");
		System.out.println(obj.getValues(hm,size));
		

	}

}
