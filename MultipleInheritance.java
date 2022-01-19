package com.bajaj.helloworld;
//Multiple Inheritance not supported by JAVA. Comma(,) is not allowed.

//abstract class--> small component, less detailed which can fit in a system and can be used.
//abstract method--> it does not have body
//interface--> A component like class but not detailed. You can't give the method implementation

// the class which implements interface defines its methods.



class camera
{
	public void print()
	{
		System.out.println("5 MP");
	}
}
// every method in the interface is abstract method
interface processor
{
	public void printProcessor();
	
}
class Mobile extends camera implements processor
{
	 public void printProcessor()
	 {
		 System.out.println("A5 chips");
	 }
	
	
}



public class MultipleInheritance
{
	public static void main(String args[])
	{
		
	}

}
