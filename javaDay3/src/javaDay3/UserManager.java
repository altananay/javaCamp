package javaDay3;

public class UserManager {
	public void LogIn(User user)
	{
		System.out.println( user.getUserID() + " ID numaralý kullanýcý " +  "sisteme giriþ yaptý");
	}
	
	public void LogOut(User user)
	{
		System.out.println( user.getUserID()  + " ID numaralý kullanýcý " + "sistemden çýkýþ yaptý.");
	}
}
