package lab6;
import java.util.*;

public class Exercise5 {

	public static int modifyNumber(int number1) {
		String str=Integer.toString(number1);
		
		StringBuffer s = new StringBuffer(str.length());
		
		System.out.println(s);
		for(int i=0;i<str.length()-1;i++)
		{  
			int diff=Character.getNumericValue(str.charAt(i+1))-Character.getNumericValue(str.charAt(i));
			s.append(Math.abs(diff));
			
		}
		s.append(Character.getNumericValue(str.charAt(str.length()-1)));
		number1 = Integer.parseInt(s.toString());
		return number1;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number");
        int number=sc.nextInt();
        
        System.out.println(modifyNumber(number));
	}

}
