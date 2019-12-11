package com.designpatern.creational;

public class Singleton {

	public static Singleton obj;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getSingletonObj()
	{
		if(obj == null)
		{
			obj = new Singleton();
			return obj;
		}
		else
			return obj;
	}
	
	public void hashcode()
	{
		System.out.println("hashCode for obj is = " + obj.hashCode());
	}

}
