package lab7;

import java.util.*;

public class Exercise7 {
	public String reverse(String s)
	{
		char []arr=s.toCharArray();
		ArrayList<Character> al=new ArrayList<Character>();
		for(char c:arr)
			al.add(c);
		Collections.reverse(al);
		String str="";
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			str=str+itr.next();
		}
		return str;
		
	}
	public Object[] getSorted(int[] arr,int size)
	{
		TreeSet<Integer> tobj=new TreeSet<Integer>(); 
		for(int i=0;i<size;i++)
		{
			String s=Integer.toString(arr[i]);
			int n=Integer.parseInt(reverse(s));
			tobj.add(n);
		}
		Object []ar=tobj.toArray();
		return ar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Array size: ");
		int size=s.nextInt();
		int []arr=new int[size];
		System.out.println("Enter Array element: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		Exercise7 obj=new Exercise7();
		Object []sortedsrr=obj.getSorted(arr, size);
		System.out.println("After reversing and sorting the aray: ");
		for(int i=0;i<sortedsrr.length;i++)
		System.out.println(sortedsrr[i]);
		s.close();
	}

}
