package com.bajaj.helloworld;


//setter function--> to set the values
//getter function--> to get the values

public class Classes 
{
	//member variables -->hold the data part
	private int a;
	private int b;
	
	//static--> Value is shared by all the methods in the class
	private static String schoolname="DBMS";
	
	//method -->which operate on given data
	Classes(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void setA(int a)
	{
		this.a=a;
	}
	public void setB(int b)
	{
		this.b=b;
	}
	
	
	public void printValue()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(schoolname);
	}
	public static void main(String args[])
	{
		Classes ob=new Classes(10,9);
		ob.printValue();
		schoolname="Java School";
		
		Classes ob1=new Classes(11,8);
		ob1.printValue();
		
		
		
	}

}
