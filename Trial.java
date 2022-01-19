package com.bajaj.helloworld;
public class Trial
{
	public static void main(String args[])
	{
		Person ob=new Person();
		ob.setName("Aditya");
		ob.setage(22);
		ob.setsalary(120000);
		ob.setaddress("nand niketan");
		ob.getName();
		Employee ob1=new Employee("AMNS");
		System.out.println(ob1.getCompany());
		
	}
	
}