package com.bajaj.helloworld;

class BasicAccount
{
	String name;
	double balance, rate;
	BasicAccount(String name, double balance, double rate)
	{
		this.name=name;
		this.balance=balance;
		this.rate=rate;
	}
	
}
class ProtectedAccount extends BasicAccount
{
	int pin;
	String name;
	double balance, rate;
	ProtectedAccount(int pin)
	{
	super(name,balance,rate);
	this.pin=pin;
	}
}
class MinimumAccount extends ProtectedAccount 
{
	int min, penalty;
	MinimumAccount(int min, int penalty)
	{
		this.min=min;
		this.penalty=penalty;
	}
}
class RegularAccount extends MinimumAccount
{
	
}
class CheckingAccount extends MinimumAccount
{
	
}
class InterestAccount extends ProtectedAccount
{
	
}

class CDAccount extends ProtectedAccount
{
	
}


public class CaseStudy {

	public static void main(String[] args) 
	{
		

	}

}
