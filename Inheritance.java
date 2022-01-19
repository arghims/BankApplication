package com.bajaj.helloworld;

//any number of classes in one file
//private available within class
//public available everywhere
//**********Multi-Level Inheritance***************
class A
{
//DI--> Dependency Injection
int a;
int b;
int c;
//method overloading
	A(int a)
	{
		this.a=a;
	}
	A()
	{
		
	}
	A(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void printA()
	{
		System.out.println("A class");
	}
	
}

class B extends A
{
	B(int c)
	{
		//super--> to send back the value to parent class. 
		//Calling the parent class constructor.
		//super(a);
		super(1,2);
		this.c=c;
	}
	public void printB()
	{
		System.out.println("B class");
	}
}
class C extends B
{
	C(int a)
	{
		super(32);
	}
	public void printC()
	{
		System.out.println("C class");
	}
}


public class Inheritance 
{
	public static void main(String args[])
	{
		//B obj=new B(10);
//		A obj1=new A(10,20);
//		System.out.println(obj1.a);
//		System.out.println(obj1.b);
		C obj=new C(10);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		obj.printA();
		obj.printB();
		obj.printC();
		
	}

}
