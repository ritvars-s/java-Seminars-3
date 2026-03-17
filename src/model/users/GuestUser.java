package model.users;

public class GuestUser {
	private long id;
	
	private static long counter = 0;
	
	public long getID() {
		return id;
	}
	public void setID() {
		id = counter++;
	}
	
	GuestUser(){
		setID();
	}
	
	public String toString() {
		String result = "ID:" + id;
		return result;
	}
	
}
