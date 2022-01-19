package com.bajaj.helloworld;
//abstract class and interface
//Override--> the methods common between parent and child classes need to be overridden to achieve run time polymorphism.


interface FeaturesMobile
{
	public void calling();
	public void sendSMS();
	public void playGame();
}

abstract class SimCardHolder
{
	public void simCard()
	{
		System.out.println("Normal sim card");
	}
	abstract void Hybridsimcard();
}
class SmartMobile extends SimCardHolder implements FeaturesMobile
{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("5G Calling");
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("SMS");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("play games");
		
	}

	@Override
	void Hybridsimcard() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MyMobile 
{

	public static void main(String[] args) 
	{
		//Anonymous class--> A class without name. can be creates for abstract class and interface.
		SimCardHolder sim=new SimCardHolder() {

			@Override
			void Hybridsimcard() {
				// TODO Auto-generated method stub
				System.out.println("My sim card");
			}
			
		};
		sim.Hybridsimcard();
		sim.simCard();
		
		FeaturesMobile featuresmobile=new FeaturesMobile()
				{

					@Override
					public void calling() {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void sendSMS() {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void playGame() {
						// TODO Auto-generated method stub
						
					}
			
				};
		

}

}
