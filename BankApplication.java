package com.bajaj.helloworld;

import java.util.Scanner;

//CLI base Application
//Menu base 
class Employees extends Object
{
	public int employeeID;
	public String name;
	
	public Employees(String name,int employeeID)
	{
		super();
		this.employeeID = employeeID;
		this.name = name;
	}
	public int getEmployeeID()
	{
		return employeeID;
	}
	public void setEmployeeID(int employeeID)
	{
		this.employeeID = employeeID;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void printEmployee()
	{
		System.out.println("Enlpoyee Name "+this.name);
		System.out.println("Enlpoyee ID "+this.employeeID);
	}
	@Override
	public String toString() 
	{
		return "Employees [employeeID=" + employeeID + ", name=" + name + "]";
	}
	
}

public class BankApplication 
{ 
	
	 public static Employees create(String name, int employeeID)
	 {
		 Employees emp=new Employees(name, employeeID);
		 return emp;
		 
	 }
	
	
	public static int delete(Employees[] emp,int index,int count)
	{
       int d=count;
		for(int i=0;i<=count;i++)
		{
			emp[index]=emp[index+1];
			d--;
		}
		for(int i=0;i<d;i++) 
		  { 
		  System.out.println("value on location "+emp[i].toString());
		  
		  } 
		 
		return d;
	}
	
	public static void update(Employees[] emp, int id, String name, int count)
	{
		Scanner sc1=new Scanner(System.in);
		for(int i=0;i<count;i++)
		{
			if(emp[i].employeeID==id)
			{
				System.out.println("Enter value to update");
				int id1=sc1.nextInt();
				String name1=sc1.next();
				emp[i].employeeID=id1;
				emp[i].name=name1;
				
				
			}
		}
		for(int i=0;i<count;i++) 
		  { 
		  System.out.println("value on location "+emp[i].toString());
		  
		  } 
				
		
	}
	public static void search_by_id(Employees[] emp, int id, int count)
	{
		for(int i=0;i<count;i++)
		{
			if(emp[i].employeeID==id)
			{
				System.out.println("Search found");
				
			}
		}
				
		
	}
	
	public static void main(String args[])
	{
		 Scanner sc=new Scanner(System.in);
		 Employees value[]=new Employees[10];
		 System.out.println("Enter the number of entries"); 
		 int n=sc.nextInt();
		 while(true) 
		 {
			  
		 System.out.println("Select your choice");
		 
		 System.out.println("Enter 1 for append");
		 System.out.println("Enter 2 for delete");
		 System.out.println("Enter 3 for update");
//		 System.out.println("Enter 4 for Search by name");
//		 System.out.println("Enter 5 for sort ASC");
//		 System.out.println("Enter 6 for sort DESC");
		 System.out.println("Enter 7 for Exit");
		 int choice= sc.nextInt();
		 if(choice==8)
		 {
			 System.err.println("Qutting the application..");
			 break;
		 }
		 if(choice==1)
		 {
			 
			 
			 for(int i=0;i<n;i++)
			 {
			  System.out.println("Enter the values for id"); 
			  int id=sc.nextInt();
			  System.out.println("Enter the values for name"); 
			  String name=sc.next();
			  value[i]=create(name,id);
			 }
			
			  for(int i=0;i<n;i++) 
			  { 
			  System.out.println("value on location "+value[i].toString());
			  
			  } 
			 
		 }
		 if(choice==2)
		 {
			 int d;
			 System.out.println("Enter value to delete");
			 int id=sc.nextInt();
			 d=delete(value, id, n);
			 for(int i=0;i<=d;i++) 
			  { 
			  System.out.println("value on location "+value[i].toString());
			  
			  } 
			 
		 }
		 if(choice==3)
		 {
			 System.out.println("Enter value to update");
			 int id=sc.nextInt();
			 System.out.println("Enter value to update");
			 String name=sc.next();
			 update(value, id, name, n);
		 }
		 if(choice==4)
		 {
			 System.out.println("Enter search id");
			 int id=sc.nextInt();
			 search_by_id(value, id, n);
			 
		 }
		 }
		
	}

}
