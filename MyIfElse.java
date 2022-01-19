package com.bajaj.helloworld;
//Keyword
//classes
//Scanner --> it is used to take input from keyboard(user)


import java.util.Scanner;


public class MyIfElse {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		/**sc.nextBoolean()
		sc.nextByte()
		sc.nextDouble()
		sc.nextLine()--> for full line
		sc.next()--> for one word**/
		//System.out.println(number);
		
		if(number>0)
		{
		    System.out.println("number is postive");
		}
		else
		{
			System.out.println("number is not");
		}	
			
		
	}

}
