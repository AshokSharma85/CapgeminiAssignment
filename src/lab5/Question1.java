package lab5;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
//Scanner class to take input from user
Scanner sc=new Scanner(System.in);
//To run while loop till we set false
boolean b=true;
	while(b)
	{ 
	String input=sc.next();
	switch(input)
	{
	case "red":
	    System.out.println("STOP");
	    break;
	case "green":
		System.out.println("Go");
		break;
	case "yellow":
		System.out.println("Ready");
	    break;
	case "exit":
		b=false;
		break;
	default :
		System.out.println("Please Enter Valid Input");	
	}
}
//To close the object of scanner class
sc.close();
	}

}
