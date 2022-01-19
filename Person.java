package com.bajaj.helloworld;

//POJO--> Plain old java object

class Person 
{	
	private String name;
	private int age;
	private int salary;
	private String address;

public void Person(String name, int age, int salary, String address)
{
	this.name=name;
	this.age=age;
	this.salary=salary;
	this.address=address;
	
}
public void setName(String name)
{
	this.name=name;
}
public void setage(int age)
{
	this.age=age;
}
public void setsalary(int salary)
{
	this.salary=salary;
}
public void setaddress(String address)
{
	this.address=address;
}
public void getName()
{
	System.out.println(name);
}
public void getage()
{
	System.out.println(age);
}
public void getsalary()
{
	System.out.println(salary);
}
public void getaddress()
{
	System.out.println(address);
}

}
class Employee extends Person 
{
	private String company;
	public Employee(String company)
	{
		//super(name,age,salary,address);
		this.company = company ;
	}
	public void setCompany(String company)
	{
		this.company = company;
	}
		
	public String getCompany() 
	{
		return company;
	}
	
}

