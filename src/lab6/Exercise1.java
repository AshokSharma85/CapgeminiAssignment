package lab6;
import java.util.*;
public class Exercise1 {
	
	public static void main(String[] args) {
		String str;
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Integer with a Comma: ");
		
		//taking input from the user
		str=s.next(); 
		
		//By using StringTokenizer class
		StringTokenizer st=new StringTokenizer(str,",");
		
		//Counting total number of element in string that is separated by ","
		int count=st.countTokens(); 
		System.out.println("Integer You entered: ");
		
		//checking weather the next element in String is present or not
		while(st.hasMoreElements())
		{
			String d=st.nextToken();
			
			//converting the string to number
			int n=Integer.parseInt(d);
			System.out.println(n);
			
			//calculating sum of integer
			
			sum=sum+n;
		}
		System.out.println("Total Sum of Integer is: "+sum);
		s.close();
	}
}
