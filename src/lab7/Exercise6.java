package lab7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Exercise6 {
	public LocalDate getDate()
	{
		Scanner scanner = new Scanner(System.in);
	    String str[] = {"year", "month", "day" };
	    String date = "";

	    for(int i=0; i<3; i++) {
	        System.out.println("Enter " + str[i] + ": ");
	        date = date + scanner.next() + "/";
	    }
	    date = date.substring(0, date.length()-1);
	   //1 System.out.println("date: "+ date); 

	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	    Date parsedDate = null;

	    try {
	        parsedDate = dateFormat.parse(date);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	    int y=parsedDate.getYear();
	    int m=parsedDate.getMonth();
	    int d=parsedDate.getDay();
	    
	    LocalDate ldate=LocalDate.of(y,m,d);
	    return ldate;

	}
	public boolean check(int year)
	{
		Date d=new Date();
		int presentyr=d.getYear();
		if((presentyr-year)>18)
			return true;
		else
			return false;
	}
	public LinkedList<Integer> votersList(LinkedHashMap<Integer,LocalDate>hmap)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		Iterator<Map.Entry<Integer, LocalDate>> itr=hmap.entrySet().iterator();
		while(itr.hasNext())
		{
			 Map.Entry<Integer, LocalDate> entry = itr.next();
			 int id=entry.getKey();
			 LocalDate d=hmap.get(id);
			 int year=d.getYear();
			 if(check(year))
				 list.add(id);
			 else
				 continue;
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise6 obj = new Exercise6();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total number of voters: ");
		int size=s.nextInt();
		LinkedHashMap<Integer,LocalDate> hmap = new LinkedHashMap<Integer,LocalDate>();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the id and age of the voter: ");
			int id=s.nextInt();
			System.out.println("Enter your Date of birth: ");
			LocalDate dob=obj.getDate();
			hmap.put(id,dob);
		}
		System.out.println("You have enter the following details: ");
		System.out.println(hmap);
		System.out.println("Elegible list of id which are eligible for vote: ");
		System.out.println(obj.votersList(hmap));
	}

}
