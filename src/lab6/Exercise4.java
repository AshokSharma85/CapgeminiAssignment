package lab6;
import java.util.*;
public class Exercise4 {

	public static String alterString(String str)
	{
		String result="";
		for(int i=0;i<str.length();i++)
		{
			//System.out.println((int)str.charAt(i));
			Character c=new Character(str.charAt(i));
			if(c.equals(new Character('a')) ||c.equals(new Character('e')) ||c.equals(new Character('i')) ||c.equals(new Character('o')) ||c.equals(new Character('u'))
			||c.equals(new Character('A')) ||c.equals(new Character('E')) ||c.equals(new Character('I')) ||c.equals(new Character('O')) ||c.equals(new Character('U')))
			{
				c=str.charAt(i);
			}
			else if(c.equals(new Character('Z')))
			{
				c='A';
			}
			else if(c.equals(new Character('z')))
			{
				c='a';	
			}
			else
			{
				int a=(int)str.charAt(i);
				a++;
				c=(char)a;
				
			}
			result=result+c;
		}
		return result;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		System.out.println(alterString(str));

	}

}
