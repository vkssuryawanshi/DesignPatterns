package com.designpatern.creational;

public class TestSingleton {

	public static void main(String[] args) 
	{
		//Singleton obj = new Singleton();  It will not allow to create the object becouse we made the constructor as private.
		
		
		Singleton obj = Singleton.getSingletonObj(); //it wil create the new object for first time.
	
		obj.hashcode();
		
		Singleton obj2 = Singleton.getSingletonObj(); //will return previously created object as 'obj';
		
		obj2.hashcode(); // you will get same hashcode for both object as it creating only once.
		

	}

}
