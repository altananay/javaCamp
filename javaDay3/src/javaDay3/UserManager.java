package javaDay3;

public class UserManager {
	public void LogIn(User user)
	{
		System.out.println( user.getUserID() + " ID numaral� kullan�c� " +  "sisteme giri� yapt�");
	}
	
	public void LogOut(User user)
	{
		System.out.println( user.getUserID()  + " ID numaral� kullan�c� " + "sistemden ��k�� yapt�.");
	}
}
