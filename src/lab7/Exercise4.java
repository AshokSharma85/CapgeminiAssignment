package lab7;

import java.util.*;

public class Exercise4 {
	public String getRemark(int marks)
	{
		if(marks>=90)
			return "Gold";
		else if(marks<90 && marks>=80)
			return "Silver";
		else if (marks<80 && marks>=70)
			return "Bronze";
		else
			return "No Medal";
	}
	public LinkedHashMap<Integer,String> getStudents(LinkedHashMap<Integer,Integer>hmap,int size)
	{
		LinkedHashMap<Integer, String> ans=new LinkedHashMap<Integer,String>();
		Iterator <Map.Entry<Integer, Integer>>itr = hmap.entrySet().iterator();
        
		while(itr.hasNext())
		{
			 Map.Entry<Integer, Integer> entry = itr.next();
			 int reg=entry.getKey();
			 int marks=hmap.get(reg);
			 String medal=getRemark(marks);
			 ans.put(reg,medal);
			
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Total number of student: ");
		int size=s.nextInt();
		LinkedHashMap<Integer, Integer> hmap=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Registration no. and Marks of student "+(i+1));
			int reg=s.nextInt();
			int marks=s.nextInt();
			hmap.put(reg,marks);
		}
		Exercise4 obj=new Exercise4();
		System.out.println(obj.getStudents(hmap,size));
		s.close();
	}

}
