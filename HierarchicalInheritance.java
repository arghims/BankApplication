package com.bajaj.helloworld;
//****************Hierarchical Inheritance*****************
class A1
{
	int a;
	int b;
	A1(int a)
	{
		this.a=a;
	}
	A1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}
class B1 extends A1
{
	B1(int a)
	{
		super(12);
	}
	
}
class C1 extends A1
{
	C1(int a)
	{
		super(13,14);
		
	}
}
public class HierarchicalInheritance 
{
	public static void main(String args[])
	{
		A1 ob=new A1(11);
		System.out.println(ob.a);
		B1 obj=new B1(11);
		System.out.println(obj.a);
		C1 obj1=new C1(11);
		System.out.print(obj1.a);
		System.out.print(obj1.b);
	
	}

}
