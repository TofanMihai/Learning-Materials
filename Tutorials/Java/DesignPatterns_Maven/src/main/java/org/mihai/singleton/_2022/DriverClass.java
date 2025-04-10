package org.mihai.singleton._2022;

public class DriverClass 
{
	
	public static void main(String[] args) 
	{
		//illegal construct
	    //Compile Time Error: The constructor SingleObject() is not visible
	    //SingleObject object = new SingleObject();
	
	    //Get the only object available
	    SingletonObject object = SingletonObject.getInstance();
	
	    //show the message
    	object.showMessage();

	}
}
