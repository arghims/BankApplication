package com.bajaj.helloworld;

public class MySwitch {
	
	public static void main(String args[])
	{
		int daynumber=1;
		
		switch(daynumber)
		{
		case 1:
			System.out.println("Mon");
			break;	
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thurse");
			break;
		case 5:
			System.out.println("Fri");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
		
	}

}
